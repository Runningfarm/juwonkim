## ﻿<~7/2 변경 사항>
 
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

## <7/9 변경사항>

은수님께서 보내주신 파일을 병합한 후에 제 쪽 파일과 충돌되는 부분이나 오탈자들을 수정했습니다. 그런데 수정된 파일 수가 너무 많아서 기존 레포에 올리는 것보다 새 레포를 만들어서 다시 정리해서 업로드했습니다. 기존 파일들 잘 실행된다면 아래 부분만 바꾸시면 될 거예요.

>>> 수정한 주요 기능
1. 인벤토리 화면에서 특정 아이템을 클릭하여 메인화면에 적용하는 시스템
2. 메인화면에서 아이템을 적용시켜 커스텀을 하는 시스템 (수정 모드)
   - 아이템 삭제 버튼
   - 아이템 회전 버튼
   - 아이템 크기 조절 버튼
   - 아이템 드래그 이동 기능
3. 앱 종료 시 수정된 인테리어 사항을 DB에 저장

수정된 파일들
```
activity_main.xml
ItemAdapter.java
MainActivity.java
Tab4Activity.java
```

새로 추가된 파일들
```
selection_border.xml
SelectableItemView.java
```

-> selection_border.xml은 new_juwon/app/src/main/res/drawable/ 들어가시면 있습니다.

안드로이드 스튜디오에서 은수님께서 작업하신 부분과 딱히 겹치는 수정된 부분은 없는 것 같아요.
그래서 각자 가지고 있는 Farm 프로젝트 파일에 위 코드들을 복사 붙여넣기해도 무방할 것 같습니다.

## <7/11 수정 사항>

1. 안드로이드 스튜디오

새로 추가된 코드 파일
```
activity_edit_profile.xml
activity_mypage.xml
CommonResponse.java
DuplicateCheckRequest.java
DuplicateCheckResponse.java
EditProfileActivity.java
EditProfileRequest.java
MypageActivity.java
```


수정된 기존 코드 파일
```
activity_register.xml
activity_tab6.xml
AndroidManifest.xml
ApiService.java
LoginResponse.java
RegisterActivity.java
RegisterRequest.java
Tab6Activity.java
```

2. VSCODE
> 줄 번호는 조금씩 다를 수 있으니 설명해둔 내용 꼼꼼히 읽어보시고 직접 위치 확인해서 추가해 주세요!

- index.js 변경사항

1)  40번째 줄 회원가입 위에 아래 코드 추가
```
app.post("/auth/check-duplicate", async (req, res) => {
  const { id } = req.body;
  try {
    const exist = await User.findOne({ id });
    res.json({ duplicate: exist ? true : false });
  } catch (err) {
    res.status(500).json({ success: false, message: "서버 오류" });
  }
});
```

2) 회원가입 API 코드 const 부분에 아래처럼 name 추가

```
// 회원가입 API
app.post("/register", async (req, res) => {
  const { id, password, weight, name } = req.body;
  console.log("회원가입 요청 들어옴!", req.body);
```

3) 69번째 줄(?) 유저 생성 및 저장 부분에 아래처럼 name 추가

```
// 유저 생성 및 저장
    const newUser = new User({
      id,
      password: hashedPassword,
      weight,
      name,
    });
```

4) 119번째줄(?) // 4. 성공 아래 res.json 부분에 아래처럼 name: user.name, 추가

```
res.json({
      success: true,
      message: "로그인 성공!",
      token,
      id: user.id,
      name: user.name,
      weight: user.weight,
      totalDistance: user.totalDistance,
      totalFood: user.totalFood,
      questsCompleted: user.questsCompleted,
    });
```

5) 마지막 쯤에

```
// 서버 실행
app.listen(3000, "0.0.0.0", () => {
  //자기 아이피주소 넣기 CMD에서 ipconfig치면 알 수 있음
  console.log(`🚀 서버 실행 중`);
});
```

여기 바로 위에 아래 코드 추가

```
// 탈퇴 API (회원 삭제)
app.delete("/user/delete", verifyToken, async (req, res) => {
  try {
    const id = req.user.id;

    const deleted = await User.findOneAndDelete({ id });

    if (!deleted) {
      return res.status(404).json({ success: false, message: "사용자를 찾을 수 없습니다." });
    }

    res.json({
      success: true,
      message: "회원 탈퇴가 완료되었습니다.",
    });
  } catch (err) {
    console.error("❌ 탈퇴 중 에러:", err);
    res.status(500).json({ success: false, message: "서버 오류", error: err });
  }
});

// 회원정보 수정 API
app.post("/user/update", async (req, res) => {
  const { id, name, password, weight } = req.body;

  try {
    const user = await User.findOne({ id });

    if (!user) {
      return res.status(404).json({ success: false, message: "사용자 없음" });
    }

    // 비밀번호 새로 암호화
    const hashedPassword = await bcrypt.hash(password, 10);

    // 값 업데이트
    user.name = name;
    user.password = hashedPassword;
    user.weight = weight;

    await user.save();

    res.json({
      success: true,
      message: "회원정보 수정 완료",
    });
  } catch (err) {
    console.error("❌ 수정 중 에러:", err);
    res.status(500).json({ success: false, message: "서버 오류", error: err });
  }
});
```


- User.js 변경사항
7번째 줄 "weight: { type: Number }, // kg" 밑에 아래 코드 추가
```
name: { type: String },
```

## <7/17 변경사항>
- 메인 화면의 캐릭터 이동 애니메이션 추가
```
activity_main.xml
MainActivity.java
SpriteView.java
```

## <7/20 수정사항>
1. UI 및 기능 수정
- 하단 탭이 각 스마트폰의 네비게이션 바와 겹쳐보이는 오류 수정
- 캐릭터 정지 기능 및 위치 저장 & 복원
- 아이템 이동 버튼 UI 수정

<수정된 xml 파일>
```
activity_main.xml
activity_mypage.xml
activity_tab2.xml
activity_tab3.xml
activity_tab4.xml
activity_tab6.xml
```

<수정된 java 파일>
```
MainActivity.java
RetrofitClient.java
SelectableitemView.java
SpriteView.java
Tab2Activity.java
Tab3Activity.java
Tab4Activity.java
Tab6Activity.java
```

## <7/21 수정사항>
>>> 변경된 내용이 많으니, 확인하실 때 조금만 더 신경 써주시면 감사하겠습니다!

1. 마이페이지 UI 수정
2. 메인화면 UI 수정
3. 회원가입 UI 수정
4. 로그인 UI 수정
5. 개인정보 수정 화면 UI 수정
6. 하단바 UI 수정
7. 개인정보 -> 이름 수정 가능하도록 변경

<기존 수정 파일>
```
activity_edit_profile.xml
activity_main.xml
activity_mypage.xml
activity_tab2.xml
activity_tab3.xml
activity_tab4.xml
activity_tab6.xml
activity_register.xml
EditProfileActivity.java
MypageActivity.java
Tab4Activity.java
build.gradle.kts (:app)
```

<새로운 추가 파일>
```
bg_button_exit.xml
bg_button_logout.xml
bg_button_profile.xml
bg_button_withdraw.xml
bg_edittext.xml
bg_edittext_disabled.xml
bg_profile_border.xml
bottom_tab_selector.xml
ic_back_cute.xml
rounded_button_bg_green.xml
rounded_button_bg_blue.xml
rounded_button_bg_red.xml
```
-> app/src/main/res/drawable/에 각 xml 추가

```
scale_on_click.xml
fade_in.xml
fade_out.xml
bounce.xml
```
-> app/src/main/res/anim/에 각 xml 추가

+) app/src/main/res/drawable/에 ic_plant.png 이미지 파일 추가

+) app/src/main/res/font/에 아래 폰트 파일 추가
```
gowundodum_regular.ttf
nanumgothic_regular.ttf
```

+) app/src/main/assets/에 person_profile.json 파일 추가

-> 전부 추가했는데도 오류가 발생하면 .idea/modules.xml 파일이 있는지 확인

-> 만약 없다면 modules.xml을 추가

-> RetrofitClient에 설정된 IP는 제 환경에 맞춘 거라 수정할 필요 없습니다.

## <7/22 수정사항>
1. 잔디 배경 추가
2. 배경 스크롤 적용
-> 캐릭터를 화면 중앙에 고정하고 배경 이미지를 이동시키는 방식

```
SpriteView.java 수정
app/src/main/res/drawable/에 grass_tiles.png 이미지 파일 추가
```

## <7/24 수정사항>
1. 메인화면 UI 수정
2. 로그인화면 UI 수정
3. running result 화면 UI 수정
4. 배경 이미지 2개 추가 (soil_tiles & stone_tiles)


- 수정한 파일
```
activity_main.xml
activity_tab6.xml
activity_runningresult.xml
rounded_button_bg_green.xml
rounded_button_bg_blue.xml
RunningResult.java
```

- 추가한 파일
```
rounded_button_bg_yellow.xml
ic_fire.png
ic_footsteps.png
ic_leaf_speed.png
soil_tiles.png
stone_tiles.png
```
-> app/src/main/res/drawable/에 각 파일 추가

- 삭제한 파일
```
rounded_button_bg_red.xml
```
-> app/src/main/res/drawable/에서 삭제

-> RetrofitClient에 설정된 IP는 제 환경에 맞춘 거라 수정할 필요 없습니다.

## <7/25 수정사항>
1. 러닝 화면 (TAB2) UI 수정
2. RunningResult 화면 폴리라인 색상 수정

- 수정한 파일
```
activity_tab2.xml
Tab2Activity.java
RunningResult.java
```

- 추가한 파일 (app/src/main/res/drawable/에 추가)
```
progressbar_green.xml
```

-> RetrofitClient에 설정된 IP는 제 환경에 맞춘 거라 수정할 필요 없습니다.

## <7/26 수정사항>
1. 퀘스트 화면 (TAB3) UI 수정
2. RunningResult 화면 배경 색 수정

- 수정한 파일
```
activity_tab3.xml
activity_runningresult.xml
Tab3Activity.java
```

- 추가한 파일

1. app/src/main/res/drawable/에 추가
```
box_locked.xml
box_opened.xml
progress_green_custom.xml
```

2. app/src/main/res/anim/에 추가
```
fade_open.xml
```

-> RetrofitClient에 설정된 IP는 제 환경에 맞춘 거라 수정할 필요 없습니다.

## <7/27 수정사항_(1)>
1. 퀘스트 화면 (TAB3) UI 살짝 수정
2. 인벤토리 화면 (TAB4) UI 수정

- 수정한 파일
```
activity_tab3.xml
activity_tab4.xml
```

- 추가한 파일

1. app/src/main/res/color/에 추가
```
chip_selector.xml
```

## <7/27 수정사항_(2)>
인벤토리 화면에서 배경 아이템을 적용하는 로직 추가

- 수정한 파일
```
activity_tab4.xml
ItemAdapter.java
MainActivity.java
SpriteView.java
Tab4Activity.java
```

# 7/17~7/27 전체 수정 내용

<기존 수정 파일>
- xml 파일
```
activity_edit_profile.xml
activity_main.xml
activity_mypage.xml
activity_register.xml
activity_runningresult.xml
activity_tab2.xml
activity_tab3.xml
activity_tab4.xml
activity_tab6.xml
```

- java 파일
```
EditProfileActivity.java
ItemAdapter.java
MainActivity.java
MypageActivity.java
RetrofitClient.java
RunningResult.java
SelectableitemView.java
SpriteView.java
Tab2Activity.java
Tab3Activity.java
Tab4Activity.java
Tab6Activity.java
```

-기타 파일
```
build.gradle.kts (:app)
```

<새로운 추가 파일>

※ anim, font, assets, color 폴더가 없으면 새로 만들기

1. app/src/main/res/drawable/에 각 xml 추가
```
bg_button_exit.xml
bg_button_logout.xml
bg_button_profile.xml
bg_button_withdraw.xml
bg_edittext.xml
bg_edittext_disabled.xml
bg_profile_border.xml
bottom_tab_selector.xml
box_locked.xml
box_opened.xml
ic_back_cute.xml
progress_green_custom.xml
progressbar_green.xml
rounded_button_bg_blue.xml
rounded_button_bg_green.xml
rounded_button_bg_yellow.xml
```

2. app/src/main/res/drawable/에 각 png 추가
```
ic_plant.png
ic_fire.png
ic_footsteps.png
ic_leaf_speed.png
grass_tiles.png
soil_tiles.png
stone_tiles.png
```

3. app/src/main/res/anim/에 각 xml 추가 
```
bounce.xml
fade_in.xml
fade_out.xml
fade_open.xml
scale_on_click.xml
```

4. app/src/main/res/font/에 각 ttf 추가
```
gowundodum_regular.ttf
nanumgothic_regular.ttf
```

5. app/src/main/assets/에 각 json 추가
```
person_profile.json
```

6. app/src/main/res/color/에 각 xml 추가
```
chip_selector.xml
```

+) 전부 추가했는데도 오류가 발생하면 .idea/modules.xml 파일이 있는지 확인 후에 만약 없다면 modules.xml을 추가

+) RetrofitClient에 설정된 IP는 본인 환경에 맞게 설정

## <8/3 수정사항>
>>> 변경된 내용이 많으니, 확인하실 때 조금만 더 신경 써주시면 감사하겠습니다!


인벤토리 농장 아이템 추가 (농작물16개, 채집25개, 장식물18개, 피크닉2개, 구조물3개, 울타리16개)

<기존 수정 파일>
```
activity_tab4.xml
Item.java
ItemAdapter.java
MainActivity.java
Tab4Activity.java
```

<삭제된 파일>
```
allcarpet.png
bed1.png
bed2.png
bed3.png
carpet1.png
carpet2.png
carpet3.png
frameimg1.png
frameimg2.png
frameimg3.png
nightstand.png
blueberry.png
cabbage.png
circle.png
corn.png
flower.png
pea.png
potato.png
pumkin.png
purple.png
radish.png
red.png
rice1.png
rice2.png
sprout.png
starfruit.png
tulip.png
tile000.png ~ tile031.png
```

<새로운 추가 파일>
```
boat.png
mailbox.png
wheat.png
potato.png
cauliflower.png
beet.png
egg_plant.png
cabbage.png
corn.png
pumpkin.png
radish.png
blueberry.png
starfruit.png
pea.png
red_mushroom.png
red_spotted_mushroom.png
purple_mushroom.png
purple_spotted_mushroom.png
basket.png
blanket.png
fence1.png ~ fence16.png
lotus.png
lilac.png
sunflower.png
blue_tulip.png
sky_blue_flower.png
blue_flower.png
beige_flower.png
heart_flower.png
small_bush.png
big_bush.png
long_wooden_path.png
wide_wooden_path.png
small_stone_path.png
long_stone_path.png
wide_stone_path.png
sign.png
left_diagonal_sign.png
right_diagonal_sign.png
stone1.png ~ stone6.png
rock1.png
rock2.png
grass1.png ~ grass4.png
thin_tree.png
basic_tree.png
wide_tree.png
small_stump.png
basic_stump.png
big_stump.png
small_fallen_tree.png
big_fallen_tree.png
```
-> app/src/main/res/drawable/에 각 png 추가

## <8/10 수정사항>
>>> 변경된 내용이 많으니, 확인하실 때 조금만 더 신경 써주시면 감사하겠습니다!

1. 인벤토리 목장 아이템 추가
2. 닭 / 소 아이템을 메인화면에 추가했을 시에 애니메이션 적용됨

<기존 수정 파일>
```
activity_tab4.xml
MainActivity.java
SelectableItemView.java
Tab4Activity.java
```

<새로운 추가 파일>
```
SelectableSpriteItemView.java
SpriteAnimUtil.java
```

-> 아래는 모두 app/src/main/res/drawable/에 추가

```
top_left_wall.png
top_center_wall.png
top_right_wall.png
bottom_left_wall.png
bottom_center_wall.png
bottom_right_wall.png
center_wall.png
wide_top_left_wall.png
wide_top_right_wall.png
wide_bottom_left_wall.png
wide_bottom_right_wall.png
hole_wall.png
floor.png
chicken_house.png
chest.png
chicken.png
cow.png
straw.png
big_straw.png
haystack.png
big_haystack.png
basket_one.png
basket_two.png
water_tray.png
empty_water_tray.png
chicken_sprites.png
cow_sprites.png
```

## <8/11 수정사항>

개인정보 화면에 총 누적 달리기 시간 UI 추가

<수정 파일>
```
activity_edit_profile.xml
```

```
<!-- 뒤로가기 버튼 -->
        <ImageButton
            android:id="@+id/backButton"
            android:layout_width="45dp"
            android:layout_height="45dp"
            android:src="@drawable/ic_back_cute"
            android:scaleType="fitCenter"
            android:adjustViewBounds="true"
            android:background="?android:attr/selectableItemBackgroundBorderless"
            android:contentDescription="뒤로가기"
            android:padding="6dp"
            android:layout_gravity="start"
            android:layout_marginBottom="25dp" />
```
-> 여기 아래에


```
<!-- [신규] 총 누적 달리기 시간 카드 -->
        <LinearLayout
            android:id="@+id/totalTimeCardProfile"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:background="#EAF6E9"
            android:padding="16dp"
            android:elevation="2dp"
            android:layout_marginBottom="16dp"
            android:layout_marginTop="4dp"
            android:backgroundTint="#EAF6E9">

            <TextView
                android:id="@+id/tvTotalLabelProfile"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="총 누적 달리기 시간"
                android:textColor="#5D7755"
                android:textSize="15sp"
                android:textStyle="bold"
                android:fontFamily="@font/nanumgothic_regular" />

            <TextView
                android:id="@+id/tvTotalRunTimeProfile"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="6dp"
                android:text="0시간 00분"
                android:textColor="#347EBF"
                android:textSize="22sp"
                android:textStyle="bold"
                android:fontFamily="@font/nanumgothic_regular" />
        </LinearLayout>
```
-> 이 코드를 추가함

## <8/13 수정사항>

합칠 때 사용한 파일은

```
index.js
User.js
Tab2Activity.java
activity_tab3.xml
```

→ 위 파일들은 깃허브에 업로드된 파일 그대로 복사해서 사용했습니다.

```
Tab3Activity.java
LoginResponse.java
EditProfileActivity.java
file_paths.xml
AndroidManifest.xml
```

→ 이 파일들은 README에 올려주신 대로 수정했습니다.

