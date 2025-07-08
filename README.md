<~7/2 변경 사항>
 
+) Tab4Activity & activity_tab4.xml는 그냥 모두 위 깃허브에 업로드된 코드로 복사 붙여넣기 하시면 돼요

1. activity_main.xml
- 15~16번째 줄
```
android:layout_width="42dp"
android:layout_height="42dp"
```
위 내용을 아래 내용으로 변경
```
android:layout_width="60dp"
android:layout_height="60dp“
```
- 190~197번째 줄
```
<ImageButton
   android:id="@+id/tab5Button"
   android:layout_width="0dp"
   android:layout_height="wrap_content"
   android:layout_weight="1"
   android:src="@drawable/ic_shop"
   android:background="@null"
   android:contentDescription="탭 5" />
```
이 부분 삭제


2. app/src/main/res/drawable에서

```
▶ ic_home
▶ ic_running
▶ ic_quest
▶ ic_inventory
▶ ic_shop
▶ ic_mypage
```
각각의 기존 이미지 파일을 위 깃허브에 업로드된 이미지 파일로 변경


3. activity_tab5.xml 삭제

4. Tab5Activity 삭제

5. activity_tab2.xml에서
```
<ImageButton
   android:id="@+id/tab5Button"
   android:layout_width="0dp"
   android:layout_height="wrap_content"
   android:layout_weight="1"
   android:src="@drawable/ic_shop"
   android:background="@null"
   android:contentDescription="탭 5" />
```
위 내용에 해당하는 259~266번째 줄 삭제

6. activity_tab3.xml에서
```
<ImageButton
   android:id="@+id/tab5Button"
   android:layout_width="0dp"
   android:layout_height="wrap_content"
   android:layout_weight="1"
   android:src="@drawable/ic_shop"
   android:background="@null"
   android:contentDescription="탭 5" />
```
위 내용에 해당하는 435~442번째 줄 삭제

7. activity_tab4.xml에서
```
<ImageButton
   android:id="@+id/tab5Button"
   android:layout_width="0dp"
   android:layout_height="wrap_content"
   android:layout_weight="1"
   android:src="@drawable/ic_shop"
   android:background="@null"
   android:contentDescription="탭 5" />
```
위 내용에 해당하는 69~76번째 줄 삭제

8. activity_tab6.xml에서
```
<ImageButton
   android:id="@+id/tab5Button"
   android:layout_width="0dp"
   android:layout_height="wrap_content"
   android:layout_weight="1"
   android:src="@drawable/ic_shop"
   android:background="@null"
   android:contentDescription="탭 5" />
```
위 내용에 해당하는 115~122번째 줄 삭제

9. MainActivity에서
```
findViewById(R.id.tab5Button).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Tab5Activity.class)));
```
위에 해당하는 83번째 줄 삭제

10. Tab2Activity에서
```
findViewById(R.id.tab5Button).setOnClickListener(view ->
                startActivity(new Intent(Tab2Activity.this, Tab5Activity.class)));
```
위에 해당하는 150~151번째 줄 삭제

11. Tab3Activity에서
```
findViewById(R.id.tab5Button).setOnClickListener(view -> startActivity(new Intent(this, Tab5Activity.class)));
```
위에 해당하는 71번째 줄 삭제

12. Tab4Activity에서
```
tab5Button = findViewById(R.id.tab5Button);
```
위에 해당하는 42번째 줄 삭제

```
tab5Button.setOnClickListener(view -> startActivity(new Intent(this, Tab5Activity.class)));
```
위에 해당하는 49번째 줄 삭제 

13. Tab6Activity에서
```
tab5Button = findViewById(R.id.tab5Button);
```
위에 해당하는 34번째 줄 삭제

```
tab5Button.setOnClickListener(v -> startActivity(new Intent(this,
                Tab5Activity.class)));
```
위에 해당하는 58~59번째 줄 삭제

14. AndroidManifest.xml에서
```
<activity android:name=".Tab5Activity" android:exported="true" />
```
위에 해당하는 42번째 줄 삭제

15. 메인화면에 캐릭터 에셋 적용

-> 깃허브에 업로드된 app/src/main/res/drawable에서 basic_spritesheet.png 이미지 리소스 파일 추가

16. 움직이는 애니메이션 추가

-> 깃허브에 업로드된 새로운 SpriteView.java 파일 추가 (복사 붙여넣기 하시면 돼요)

17. 인벤토리에 농장/울타리 아이템 추가

-> 깃허브에 업로드된 app/src/main/res/drawable에서 tile000.png ~ tile031.png(총 32개) 이미지 리소스 파일 추가



<7/5 변경사항>

1. 하단 탭 간격 정리

```
activity_main.xml
activity_tab2.xml
activity_tab3.xml
activity_tab4.xml
activity_tab6.xml
```

위 해당하는 XML 파일들의 하단 탭을 모두 아래로 수정

```
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="60dp"
        android:orientation="horizontal"
        android:background="#F5F5F5"
        android:paddingTop="6dp"
        android:elevation="8dp"
        android:gravity="center"
        android:weightSum="6"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageButton
            android:id="@+id/tab1Button"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:src="@drawable/ic_home"
            android:background="@null"
            android:contentDescription="탭 1" />

        <Space
            android:layout_width="16dp"
            android:layout_height="wrap_content" />

        <ImageButton
            android:id="@+id/tab2Button"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:src="@drawable/ic_running"
            android:background="@null"
            android:contentDescription="탭 2" />

        <Space
            android:layout_width="16dp"
            android:layout_height="wrap_content" />

        <ImageButton
            android:id="@+id/tab3Button"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@null"
            android:contentDescription="탭 3"
            android:src="@drawable/ic_quest" />

        <Space
            android:layout_width="16dp"
            android:layout_height="wrap_content" />

        <ImageButton
            android:id="@+id/tab4Button"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:src="@drawable/ic_inventory"
            android:background="@null"
            android:contentDescription="탭 4" />

        <Space
            android:layout_width="16dp"
            android:layout_height="wrap_content" />

        <ImageButton
            android:id="@+id/tab6Button"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:src="@drawable/ic_mypage"
            android:background="@null"
            android:contentDescription="탭 6" />
    </LinearLayout>
```

-> 위 내용은 각 ImageButton 태그 사이에 아래 코드를 삽입한 것

```
<Space
            android:layout_width="16dp"
            android:layout_height="wrap_content" />
```

2. 캐릭터 중앙 배치 및 크기 조정

SpriteView.java의 94번째 줄

```
private void drawFrame(Canvas canvas) {
        canvas.drawColor(0xFFFFFAF0);  // 배경 색 맞추기

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastFrameTime > frameDuration) {
            frameIndex = (frameIndex + 1) % frameCount;
            lastFrameTime = currentTime;
        }

        srcRect.left = frameIndex * frameWidth;
        srcRect.top = frameRow * frameHeight;
        srcRect.right = srcRect.left + frameWidth;
        srcRect.bottom = srcRect.top + frameHeight;

        canvas.drawBitmap(spriteSheet, srcRect, dstRect, null);
    }
```

위의 drawFrame 함수가 사용된 코드를 아래 내용으로 수정

```
private void drawFrame(Canvas canvas) {
        canvas.drawColor(0xFFFFFAF0); // 배경

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastFrameTime > frameDuration) {
            frameIndex = (frameIndex + 1) % frameCount;
            lastFrameTime = currentTime;
        }

        srcRect.left = frameIndex * frameWidth;
        srcRect.top = frameRow * frameHeight;
        srcRect.right = srcRect.left + frameWidth;
        srcRect.bottom = srcRect.top + frameHeight;

        // 중앙 좌표 계산
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();

        int size = (int)(frameWidth * 2); // 크기를 2배로 축소 (필요시 1.5, 1.2 등 조정 가능)

        int left = (canvasWidth - size) / 2;
        int top = (canvasHeight - size) / 2;

        dstRect.left = left;
        dstRect.top = top;
        dstRect.right = left + size;
        dstRect.bottom = top + size;

        canvas.drawBitmap(spriteSheet, srcRect, dstRect, null);
    }
```

3. 앱 실행 시 캐릭터 메뉴를 보이지 않도록 설정 (캐릭터 클릭 시에만 캐릭터 메뉴가 보이게 설정)

activity_main.xml의 캐릭터 메뉴를 설정하는 코드에서 73번째 줄의 visible -> gone으로 수정 (아래 참고)
```
android:visibility="gone"
```

<7/8 변경사항>
1. 작물 및 가구 아이템 인벤토리에 추가

```
작물 아이템
: blueberry, cabbage, circle, corn, flower, pea, potato, pumkin, purple, radish, red, rice1, rice2, sprout, starfruit, tulip
```

```
가구 아이템
: allcarpet, bed1, bed2, bed3, carpet1, carpet2, carpet3, frameimg1, frameimg2, frameimg3, nightstand
```

app/src/main/res/drawable에 각각의 이미지 파일 추가

2. Tab4Activity.java 수정

117번째 줄 loadItems 함수가 사용된 부분 아래 내용으로 수정 

```
private void loadItems(String category) {
        itemList.clear();

        if (category.equals("울타리")) {
            for (int i = 0; i < 32; i++) {
                String resName = String.format("tile%03d", i);
                int resId = getResources().getIdentifier(resName, "drawable", getPackageName());
                if (resId != 0) {
                    itemList.add(new Item("울타리 " + (i + 1), "울타리", 0, resId, true));
                }
            }

        } else if (category.equals("작물")) {
            String[] cropNames = {
                    "blueberry", "cabbage", "circle", "corn", "flower",
                    "pea", "potato", "pumkin", "purple", "radish",
                    "red", "rice1", "rice2", "sprout", "starfruit", "tulip"
            };

            for (int i = 0; i < cropNames.length; i++) {
                String resName = cropNames[i];
                int resId = getResources().getIdentifier(resName, "drawable", getPackageName());
                if (resId != 0) {
                    itemList.add(new Item("작물 " + (i + 1), "작물", 0, resId, true));
                }
            }

        } else if (category.equals("가구")) {
            String[] furnitureNames = {
                    "allcarpet", "bed1", "bed2", "bed3",
                    "carpet1", "carpet2", "carpet3",
                    "frameimg1", "frameimg2", "frameimg3", "nightstand"
            };

            for (int i = 0; i < furnitureNames.length; i++) {
                String resName = furnitureNames[i];
                int resId = getResources().getIdentifier(resName, "drawable", getPackageName());
                if (resId != 0) {
                    itemList.add(new Item("가구 " + (i + 1), "가구", 0, resId, true));
                }
            }

        } else if (category.equals("먹이")) {
            int feedImageRes = R.drawable.feed_item;
            int count = prefs.getInt(KEY_FOOD_COUNT, 3);
            itemList.add(new Item("먹이 아이템", "먹이", count, feedImageRes, true));
        }
    }
```


맨 위 import 부분에 아래 내용 추가

```
import android.view.View;
```
