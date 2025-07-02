package kr.ac.hs.farm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "FarmPrefs";
    private static final String KEY_FOOD_COUNT = "foodCount";
    private static final String KEY_LEVEL = "level";
    private static final String KEY_EXPERIENCE = "experience";

    private ImageButton mailButton;
    private ImageButton characterButton;
    private LinearLayout characterMenu;
    private Button feedButton;
    private ImageButton exitButton;

    private ProgressBar levelProgressBar;
    private TextView levelText;
    private TextView foodCountText;

    private boolean isMenuVisible = false;

    private int foodCount = 3;
    private int level = 1;
    private int experience = 0;

    private final int MAX_EXPERIENCE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mailButton = findViewById(R.id.mailButton);
        characterButton = findViewById(R.id.characterButton);
        characterMenu = findViewById(R.id.characterMenu);
        feedButton = findViewById(R.id.feedButton);
        exitButton = findViewById(R.id.exitButton);

        levelProgressBar = findViewById(R.id.levelProgressBar);
        levelText = findViewById(R.id.levelText);
        foodCountText = findViewById(R.id.foodCountText);

        loadData();

        // 캐릭터 버튼 숨기기
        characterButton.setVisibility(View.GONE);

        // farmArea 안에 SpriteView 추가
        FrameLayout farmArea = findViewById(R.id.farmArea);
        SpriteView spriteView = new SpriteView(this);

        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                400, 400 // 크기(px)
        );
        params.gravity = Gravity.CENTER;
        spriteView.setLayoutParams(params);

        farmArea.addView(spriteView);

        // SpriteView 클릭하면 캐릭터 메뉴 토글
        spriteView.setOnClickListener(v -> toggleCharacterMenu());

        // 캐릭터 메뉴 토글 버튼 (원래 버튼은 숨겼지만 기능은 유지)
        characterButton.setOnClickListener(view -> toggleCharacterMenu());

        // 먹이주기 버튼
        feedButton.setOnClickListener(view -> giveFood());

        // 탭 버튼 클릭 시 각 액티비티 이동
        findViewById(R.id.tab1Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity.class)));
        findViewById(R.id.tab2Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Tab2Activity.class)));
        findViewById(R.id.tab3Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Tab3Activity.class)));
        findViewById(R.id.tab4Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Tab4Activity.class)));
        findViewById(R.id.tab6Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Tab6Activity.class)));

        // 종료 버튼 클릭 시 종료 다이얼로그
        exitButton.setOnClickListener(view -> showExitDialog());

        // 보상 처리
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("reward")) {
            int reward = intent.getIntExtra("reward", 0);
            foodCount += reward;
            saveData();
            Toast.makeText(this, "보상으로 먹이 " + reward + "개를 받았습니다!", Toast.LENGTH_SHORT).show();
        }

        updateUI();
    }

    private void toggleCharacterMenu() {
        isMenuVisible = !isMenuVisible;
        characterMenu.setVisibility(isMenuVisible ? View.VISIBLE : View.GONE);
    }

    private void giveFood() {
        if (foodCount > 0) {
            foodCount--;
            experience += 20;
            Toast.makeText(this, "냥이에게 먹이를 줬어요! 남은 먹이: " + foodCount, Toast.LENGTH_SHORT).show();

            if (experience >= MAX_EXPERIENCE) {
                levelUp();
            }

            updateUI();
            saveData();
        } else {
            Toast.makeText(this, "먹이가 부족합니다! 더 구입해 주세요.", Toast.LENGTH_SHORT).show();
        }
    }

    private void levelUp() {
        level++;
        experience -= MAX_EXPERIENCE;
        Toast.makeText(this, "레벨업! 현재 레벨: " + level, Toast.LENGTH_SHORT).show();
    }

    private void updateUI() {
        levelText.setText("LV " + level);
        levelProgressBar.setMax(MAX_EXPERIENCE);
        levelProgressBar.setProgress(experience);

        if (foodCountText != null) {
            foodCountText.setText("먹이: " + foodCount);
        }

        if (foodCount <= 0) {
            feedButton.setEnabled(false);
            feedButton.setAlpha(0.5f);
        } else {
            feedButton.setEnabled(true);
            feedButton.setAlpha(1.0f);
        }
    }

    private void showExitDialog() {
        new AlertDialog.Builder(this)
                .setTitle("앱 종료")
                .setMessage("정말 종료하시겠습니까?")
                .setPositiveButton("종료", (dialog, which) -> {
                    saveData();
                    finishAffinity();
                })
                .setNegativeButton("취소", null)
                .show();
    }

    private void saveData() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_FOOD_COUNT, foodCount);
        editor.putInt(KEY_LEVEL, level);
        editor.putInt(KEY_EXPERIENCE, experience);
        editor.apply();
    }

    private void loadData() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        foodCount = prefs.getInt(KEY_FOOD_COUNT, 3);
        level = prefs.getInt(KEY_LEVEL, 1);
        experience = prefs.getInt(KEY_EXPERIENCE, 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveData();
    }
}