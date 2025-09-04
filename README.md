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



## <7/5 변경사항>

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

## <7/8 변경사항>
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

## <8/19 수정사항>

1. 집 아이템 추가
2. 캐릭터 이동 시 배치된 아이템 위치 고정
3. 캐릭터 & 배경 이미지 화질 개선


<기존 수정 파일>
```
activity_tab4.xml
MainActivity.java
SelectableItemView.java
SelectableSpriteItemView.java
SpriteAnimUtil.java
SpriteView.java
Tab4Activity.java
```

<새로운 추가 파일>
```
bed_light_green.png
bed_pink.png
bed_skyblue.png
carpet.png
carpet_light_green.png
carpet_pink.png
carpet_skyblue.png
chair_behind.png
chair_front.png
chair_left.png
chair_right.png
clock.png
clock_edge.png
clock_bezel.png
frame_flower.png
frame_morning.png
frame_night.png
mood_light_light_green.png
mood_light_pink.png
mood_light_skyblue.png
nightstand.png
pot_blue_flower.png
pot_sprout.png
pot_sunflower.png
table_big.png
table_small.png
tiles_grass.png
tiles_soil.png
tiles_stone.png
```

-> 모두 app/src/main/res/drawable/에 추가

<삭제된 파일>
```
grass_tiles.png
soil_tiles.png
stone_tiles.png
```

## <8/27 수정사항>

1. 울타리 & 목장 & 집 드래그 설치
2. 울타리 & 목장 & 집 문 추가
3. Tab3 UI 및 캐릭터 이동 속도 수정


<기존 수정 파일>
```
activity_tab3.xml
ItemAdapter.java
MainActivity.java
SelectableItmeView.java
SpriteView.java
Tab4Activity.java
```

<새로운 추가 파일>
1. java 파일
```
FenceAtlas.java
FencePlacerOverlay.java
GateAtlas.java
HouseAtlas.java
SelectableFenceGateView.java
SelectableFenceView.java
```

2. app/src/main/res/drawable/
```
door_animation_sprites.png
fence.png
fences.png
house.png
wooden_house_walls.png
```

3. app/src/main/res/drawable-nodpi/ (drawable-nodpi 파일 없으면 새로 생성)
```
fence_gates.png
```


<삭제된 파일>
```
fence1.png ~ fence16.png 전부
```

## 수정 내용
>>> activity_tab3.xml 제외 겹치는 파일 없는 분들은 그냥 복붙하셔도 상관 없습니다.

>>> 수정 내용이 매우 많아서 안 되는 부분은 >8/27 수정사항< 클릭해서 파일 참고해주시고 그래도 막히는 부분은 연락주세요.

1. activity_tab3.xml (Ctrl + f 버튼 활용)

각 23개의 퀘스트의 ProgressBar 부분
```
android:progress="30"
```
을
```
android:progress="0"
```
로 수정

2. ItemAdapter.java

(1)
```
private Context context;
    private ItemClickListener itemClickListener;
```
를

```
private final Context context;
    private final ItemClickListener itemClickListener;
```
로 변경

(2)
```
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
```
안의

```
Item item = itemList.get(position);
```
바로 밑에

```
holder.imageView.setImageResource(item.imageRes);

        if (!item.obtained) {
            holder.imageView.setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
        } else {
            holder.imageView.clearColorFilter();
        }
```
여기 전체를

```
// === 인벤토리 썸네일만 치환 ===
        int thumbRes = item.imageRes;

        // 울타리 툴(인벤토리 아이콘만 별도)
        if ("울타리".equals(item.category) && "fence_tool".equals(item.name)) {
            Integer icon = resolveDrawableId("fence_tool_icon", "fence", "fence_icon");
            if (icon != null) thumbRes = icon;
        }

        // 집 설치 툴(목장/집 공통) → house.png 로 보이게
        if ("house_wall_tool".equals(item.name)
                && ("목장_구조물".equals(item.category) || "건축물".equals(item.category))) {
            // 가장 먼저 "house" 를 찾고, 없을 때만 예비 이름들로 대체
            Integer icon = resolveDrawableId(
                    "house",                // <-- 여기 파일만 두면 이게 바로 쓰여요
                    "house_tool_icon",
                    "house_install_icon",
                    "house_wall_tool_icon",
                    "house_icon"
            );
            if (icon != null) thumbRes = icon;
        }

        holder.imageView.setImageResource(thumbRes);
```
로 변경

(3)
```
if (item.category.equals("먹이")) {
```
여기를

```
if ("먹이".equals(item.category)) {
```
로 변경

(4)
```
if (item.category.equals("배경")) {
```
여기를

```
if ("배경".equals(item.category)) {
```
로 변경

(5)
```
Toast.makeText(context, "배경이 변경되었습니다!", Toast.LENGTH_SHORT).show();
                            context.startActivity(new Intent(context, MainActivity.class));
```
바로 밑에

```
} else if ("울타리".equals(item.category) && "fence_tool".equals(item.name)) {
                            Intent intent = new Intent(context, MainActivity.class);
                            intent.putExtra("applyFenceTool", true);
                            intent.putExtra("fenceAtlasResId", item.imageRes);
                            context.startActivity(intent);

                        } else if ("목장_구조물".equals(item.category) && "house_wall_tool".equals(item.name)) {
                            Intent intent = new Intent(context, MainActivity.class);
                            intent.putExtra("applyHouseTool", true);
                            intent.putExtra("houseAtlasResId", item.imageRes);
                            intent.putExtra("toolOkText", "목장 설치 끝");
                            context.startActivity(intent);

                        } else if ("건축물".equals(item.category) && "house_wall_tool".equals(item.name)) {
                            Intent intent = new Intent(context, MainActivity.class);
                            intent.putExtra("applyHouseTool", true);
                            intent.putExtra("houseAtlasResId", item.imageRes);
                            intent.putExtra("toolOkText", "집 벽 설치 끝");
                            context.startActivity(intent);
```
를 추가

(6)
```
@Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView itemCount;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImage);
            itemCount = itemView.findViewById(R.id.itemCount);
        }
    }
```
여기 바로 위에

```
/** 주어진 이름들 중 존재하는 drawable의 첫 번째 id 반환. 없으면 null */
    private Integer resolveDrawableId(String... names) {
        for (String n : names) {
            int id = context.getResources().getIdentifier(n, "drawable", context.getPackageName());
            if (id != 0) return id;
        }
        return null;
    }
```
추가

3. MainActivity.java

(1)
```
import android.content.SharedPreferences;
```
아래에

```
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
```
추가

(2)
```
import android.os.Bundle;
```
아래에

```
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
```
추가

(3)
```
import org.json.JSONObject;
```
아래에

```
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
```
추가

(4)
```
// 카메라 오프셋(배경 소스 좌상단)
    private int cameraLeft = 0;
    private int cameraTop = 0;
```
아래에

```
// Grid
    public static final int GRID_PX = 64;
    private int fenceDisplaySizePx = 64;

    // Fence
    private FencePlacerOverlay fenceOverlay;
    private FenceAtlas fenceAtlas;
    private LinearLayout fenceModeBar;

    // ★ 목장 문 배치 토글/버퍼(= 펜스 설치 모드의 '문 위치' 표식용)
    private boolean ranchDoorPlacementOn = false;
    private final HashSet<Point> ranchDoorCellsBuffer = new HashSet<>();

    // House walls / Ranch structure walls
    private FencePlacerOverlay houseOverlay;
    private HouseAtlas houseAtlas;
    private LinearLayout houseModeBar;

    // ★ 집/구조물 문 배치 토글/버퍼(= 벽 설치 모드의 문 위치 표식용)
    private boolean houseDoorPlacementOn = false;
    private final HashSet<Point> houseDoorCellsBuffer = new HashSet<>();

    // ──[ 울타리 게이트용 태그(기존 유지) ]────────────────────────────────────────
    private static final int TAG_KEY_GATE           = 0x7f0A0001;  // Boolean: 게이트 여부
    private static final int TAG_KEY_GATE_FRAME     = 0x7f0A0002;  // Integer 0..4
    private static final int TAG_KEY_GATE_OPENING   = 0x7f0A0003;  // Boolean
    private static final int TAG_KEY_GATE_LISTENER  = 0x7f0A0004;  // Boolean
    private static final int TAG_KEY_GATE_VERTICAL  = 0x7f0A0005;  // Boolean: 세로 게이트?
    private static final int TAG_KEY_GATE_GROUP     = 0x7f0A0006;  // String: 그룹 ID
    private static final int TAG_KEY_GATE_SLICE     = 0x7f0A0007;  // Integer: 조각 index(가로 0..3 / 세로 0..4)

    // ──[ 집/목장 구조물 '문' 태그(신규 애니) ]─────────────────────────────────
    private static final int TAG_IS_DOOR        = 0x7f0A1001; // Boolean
    private static final int TAG_DOOR_TYPE      = 0x7f0A1002; // String "RANCH" | "HOUSE"
    private static final int TAG_DOOR_GROUP     = 0x7f0A1003; // String
    private static final int TAG_DOOR_SLICE     = 0x7f0A1004; // Integer (RANCH: 0..2, HOUSE: 0)
    private static final int TAG_DOOR_FRAME     = 0x7f0A1005; // Integer 0..5
    private static final int TAG_DOOR_LISTENER  = 0x7f0A1006; // Boolean

    // ──[ 울타리 게이트 스프라이트(기존 유지) ]────────────────────────────────
    private Bitmap gateSheet;
    private Bitmap[][] gateHFrameSlices; // [frame 0..4][slice 0..3]
    private Bitmap[][] gateVFrameSlices; // [frame 0..4][slice 0..2]

    // ──[ 집/목장 구조물 문 스프라이트(신규 애니) ]────────────────────────────
    private static final int DOOR_FRAMES = 6;
    private Bitmap doorSheet;
    private Bitmap[]  houseDoorFrames;          // [0..5]
    private Bitmap[][] ranchDoorFrameSlices;    // [0..5][slice 0..2]

    // 집/구조물 설치 모드가 '목장(축사/외양간)'인지 여부
    private boolean isRanchBuild = false;

    private final Handler ui = new Handler(Looper.getMainLooper());

    private int dp(int v){
        return Math.round(getResources().getDisplayMetrics().density * v);
    }
    private void shrinkButton(Button b){
        b.setMinWidth(0);
        b.setPadding(dp(10), dp(6), dp(10), dp(6));
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.bottomMargin = dp(6); // 버튼 사이 간격
        b.setLayoutParams(lp);
    }
```
추가

(5)
```
spriteView.setOnCameraChangeListener((left, top) -> {
```
바로 밑에 

```
cameraLeft = left;
            cameraTop = top;
            applyCameraToAllItems();
```
를

```
cameraLeft = left; cameraTop = top;
            applyCameraToAllItems();
            if (fenceOverlay != null) fenceOverlay.setCamera(left, top);
            if (houseOverlay != null) houseOverlay.setCamera(left, top);
```
로 바꿔서 붙여넣기


(6)
```
updateUI();
        restoreAppliedItems();
        applyInventoryItem(intent);
```
여기 아래에

```
// ==== 툴 모드 진입 ====
        boolean needFenceMode = intent != null && intent.getBooleanExtra("applyFenceTool", false);
        if (needFenceMode) {
            int atlasResId = intent.getIntExtra("fenceAtlasResId", R.drawable.fences);
            enterFenceMode(atlasResId);
        }
        boolean needHouseMode = intent != null && intent.getBooleanExtra("applyHouseTool", false);
        if (needHouseMode) {
            int atlasResId = intent.getIntExtra("houseAtlasResId", R.drawable.wooden_house_walls);
            String okText = intent.getStringExtra("toolOkText");
            enterHouseMode(atlasResId, okText);
        }
```
붙여넣기

(7)
```
.setPositiveButton("네", (dialog, which) -> {
                        setEditMode(false);
                        saveAppliedItems(); // 월드 좌표로 저장
                        Toast.makeText(this, "수정이 완료되었습니다!", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("아니오", null)
                    .show();
```
여기를

```
.setPositiveButton("네", (d, w) -> {
                        setEditMode(false);
                        saveAppliedItems();
                        exitFenceMode();
                        exitHouseMode();
                        Toast.makeText(this, "수정이 완료되었습니다!", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("아니오", null)
                    .show();
```
로 바꾸기

(8)
```
@Override
    protected void onPause() {
        super.onPause();
        if (spriteView != null) spriteView.saveCharacterPosition();

        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableSpriteItemView) {
                ((SelectableSpriteItemView) child).stopAnim();
                ((SelectableSpriteItemView) child).disableWander();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableSpriteItemView) {
                ((SelectableSpriteItemView) child).startAnim();
                if (!isEditMode) {
                    ((SelectableSpriteItemView) child).enableWander(farmArea);
                }
            }
        }
        // 복귀 시 카메라 오프셋 다시 반영
        applyCameraToAllItems();
        // 월드 경계도 보장
        applyWorldBoundsToAnimals();
    }
```
여기를

```
@Override protected void onPause() {
        super.onPause();
        if (spriteView != null) spriteView.saveCharacterPosition();
        if (fenceAtlas != null) { fenceAtlas.dispose(); fenceAtlas = null; }
        if (houseAtlas != null) { houseAtlas.dispose(); houseAtlas = null; }

        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableSpriteItemView) {
                ((SelectableSpriteItemView) child).stopAnim();
                ((SelectableSpriteItemView) child).disableWander();
            }
        }
    }

    @Override protected void onResume() {
        super.onResume();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableSpriteItemView) {
                ((SelectableSpriteItemView) child).startAnim();
                if (!isEditMode) ((SelectableSpriteItemView) child).enableWander(farmArea);
            }
        }
        applyCameraToAllItems();
        applyWorldBoundsToAnimals();
    }
```
로 바꾸기

(9)
```
// 현재 카메라 오프셋 즉시 계산(첫 프레임 전에도 일관)
        int[] cam = spriteView != null ? spriteView.computeCurrentCameraLT() : new int[]{cameraLeft, cameraTop};
        float camLeftNow = cam[0];
        float camTopNow  = cam[1];

        String json = prefs.getString(key, "[]");
        try {
            JSONArray array = new JSONArray(json);
            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);

                if (obj.has("isBackground") && obj.getBoolean("isBackground")) {
                    int bgResId = obj.getInt("resId");
                    prefs.edit().putInt("selectedBackground", bgResId).apply();
                    continue;
                }

                int resId = obj.getInt("resId");

                float worldX = (float) obj.optDouble("worldX", Float.NaN);
                float worldY = (float) obj.optDouble("worldY", Float.NaN);
                if (Float.isNaN(worldX) || Float.isNaN(worldY)) {
                    // 구버전 저장본 호환: x/y는 화면좌표
                    float screenX = (float) obj.getDouble("x");
                    float screenY = (float) obj.getDouble("y");
                    worldX = screenX + camLeftNow;
                    worldY = screenY + camTopNow;
                }

                int width = obj.getInt("width");
                int height = obj.getInt("height");
                float rotation = (float) obj.optDouble("rotation", 0);

                if (isAnimalRes(resId)) {
                    addAnimalToFarmAreaWorld(resId, worldX, worldY, width, height, rotation);
                } else {
                    addItemToFarmAreaWorld(resId, worldX, worldY, width, height, rotation);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 카메라/월드 반영
        applyCameraToAllItems();
        applyWorldBoundsToAnimals();
```
여기 삭제하고

```
String key = getItemKey();
        if (key == null) return;
```
바로 밑에 

```
int[] cam = spriteView != null ? spriteView.computeCurrentCameraLT() : new int[]{cameraLeft, cameraTop};
        float camLeftNow = cam[0], camTopNow = cam[1];

        String json = prefs.getString(key, "[]");
        try {
            JSONArray arr = new JSONArray(json);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);

                if (obj.optBoolean("isBackground", false)) {
                    int bgResId = obj.getInt("resId");
                    prefs.edit().putInt("selectedBackground", bgResId).apply();
                    continue;
                }

                int resId = obj.getInt("resId");
                float worldX = (float) obj.optDouble("worldX", Float.NaN);
                float worldY = (float) obj.optDouble("worldY", Float.NaN);
                if (Float.isNaN(worldX) || Float.isNaN(worldY)) {
                    float screenX = (float) obj.getDouble("x");
                    float screenY = (float) obj.getDouble("y");
                    worldX = screenX + camLeftNow; worldY = screenY + camTopNow;
                }

                int width = obj.getInt("width");
                int height = obj.getInt("height");
                float rotation = (float) obj.optDouble("rotation", 0);

                boolean isFence = obj.optBoolean("isFence", false);
                boolean isDoor  = obj.optBoolean("isDoor", false);
                boolean isGate  = obj.optBoolean("isGate", false); // 구버전/게이트 복원

                if (isFence) {
                    int atlasResId = obj.optInt("fenceAtlasResId", R.drawable.fences);
                    int mask = obj.optInt("fenceMask", 0);
                    int gx = obj.optInt("gridX", Math.round(worldX/GRID_PX));
                    int gy = obj.optInt("gridY", Math.round(worldY/GRID_PX));

                    Bitmap tile16;
                    if (isHouseAtlas(atlasResId)) {
                        if (houseAtlas == null) houseAtlas = new HouseAtlas(this, atlasResId, 16);
                        tile16 = (mask > 15) ? houseAtlas.getFloorBitmap()
                                : houseAtlas.getByMask(mask);
                    } else {
                        if (fenceAtlas == null) fenceAtlas = new FenceAtlas(this, atlasResId);
                        tile16 = fenceAtlas.getByMask(mask);
                    }

                    SelectableFenceView fv = new SelectableFenceView(this, tile16, fenceDisplaySizePx, mask, atlasResId);
                    fv.setFenceGridCell(gx, gy);
                    fv.setFenceMode(true);
                    fv.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
                    fv.setRotation(rotation);
                    fv.setCameraOffset(cameraLeft, cameraTop);
                    fv.setWorldPosition(gx*GRID_PX, gy*GRID_PX);

                    // 게이트 복원
                    if (isGate) {
                        fv.setTag(TAG_KEY_GATE, Boolean.TRUE);
                        fv.setTag(TAG_KEY_GATE_GROUP, obj.optString("gateGroup", gx+","+gy));
                        fv.setTag(TAG_KEY_GATE_SLICE, obj.optInt("gateSlice", 0));
                        fv.setTag(TAG_KEY_GATE_FRAME, obj.optInt("gateFrame", 0));
                        fv.setTag(TAG_KEY_GATE_VERTICAL, obj.optBoolean("gateVertical", false));
                        fv.setTag(TAG_KEY_GATE_OPENING, obj.optBoolean("gateOpening", false));
                    }

                    // 문(집/구조물) 복원
                    if (isDoor) {
                        fv.setTag(TAG_IS_DOOR, Boolean.TRUE);
                        fv.setTag(TAG_DOOR_GROUP, obj.optString("doorGroup", gx+","+gy));
                        fv.setTag(TAG_DOOR_SLICE, obj.optInt("doorSlice", 0));
                        fv.setTag(TAG_DOOR_FRAME, obj.optInt("doorFrame", 5)); // 기본 5(닫힘)로 보정
                        String type = obj.optString("doorType", null);
                        if (type == null) type = isHouseAtlas(atlasResId) ? "HOUSE" : "RANCH";
                        fv.setTag(TAG_DOOR_TYPE, type);
                    }

                    fv.setEditEnabled(isEditMode);
                    if (isEditMode) fv.showBorderAndButtons(); else fv.hideBorderAndButtons();
                    fv.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView)v));
                    farmArea.addView(fv);
                    continue;
                }

                if (isAnimalRes(resId)) {
                    addAnimalToFarmAreaWorld(resId, worldX, worldY, width, height, rotation);
                } else {
                    addItemToFarmAreaWorld(resId, worldX, worldY, width, height, rotation);
                }
            }
        } catch (Exception e) { e.printStackTrace(); }

        recalcAllGridMasks();
        applyCameraToAllItems();
        applyWorldBoundsToAnimals();
```
붙여 넣기

(10)
```
private void saveAppliedItems() {
```
여기 안을

```
String key = getItemKey(); if (key == null) return;

        JSONArray array = new JSONArray();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableItemView) {
                SelectableItemView v = (SelectableItemView) child;
                try {
                    JSONObject obj = new JSONObject();
                    obj.put("resId", v.getResId());
                    obj.put("worldX", v.getWorldX());
                    obj.put("worldY", v.getWorldY());
                    obj.put("x", v.getX());
                    obj.put("y", v.getY());
                    obj.put("width", v.getWidth());
                    obj.put("height", v.getHeight());
                    obj.put("rotation", v.getRotation());

                    Integer fenceMask = v.getFenceMaskTag();
                    Integer atlasTag  = v.getAtlasResIdTag();
                    Integer gxTag     = v.getFenceGridXTag();
                    Integer gyTag     = v.getFenceGridYTag();
                    if (fenceMask != null && atlasTag != null) {
                        obj.put("isFence", true);
                        obj.put("fenceMask", fenceMask);
                        obj.put("fenceAtlasResId", atlasTag);
                        if (gxTag != null) obj.put("gridX", gxTag);
                        if (gyTag != null) obj.put("gridY", gyTag);

                        // 게이트 저장(울타리)
                        if (Boolean.TRUE.equals(v.getTag(TAG_KEY_GATE))) {
                            obj.put("isGate", true);
                            Object grp = v.getTag(TAG_KEY_GATE_GROUP);
                            if (grp != null) obj.put("gateGroup", grp.toString());
                            Object sl  = v.getTag(TAG_KEY_GATE_SLICE);
                            if (sl instanceof Integer) obj.put("gateSlice", (Integer)sl);
                            Object fr  = v.getTag(TAG_KEY_GATE_FRAME);
                            if (fr instanceof Integer) obj.put("gateFrame", (Integer)fr);
                            Object vt  = v.getTag(TAG_KEY_GATE_VERTICAL);
                            if (vt instanceof Boolean) obj.put("gateVertical", (Boolean)vt);
                            Object op  = v.getTag(TAG_KEY_GATE_OPENING);
                            if (op instanceof Boolean) obj.put("gateOpening", (Boolean)op);
                        }

                        // 문 저장(집/구조물)
                        if (Boolean.TRUE.equals(v.getTag(TAG_IS_DOOR))) {
                            obj.put("isDoor", true);
                            Object grp = v.getTag(TAG_DOOR_GROUP);
                            if (grp != null) obj.put("doorGroup", grp.toString());
                            Object sl  = v.getTag(TAG_DOOR_SLICE);
                            if (sl instanceof Integer) obj.put("doorSlice", (Integer)sl);
                            Object fr  = v.getTag(TAG_DOOR_FRAME);
                            if (fr instanceof Integer) obj.put("doorFrame", (Integer)fr);
                            Object tp  = v.getTag(TAG_DOOR_TYPE);
                            if (tp != null) obj.put("doorType", tp.toString());
                        }
                    }

                    array.put(obj);
                } catch (Exception e) { e.printStackTrace(); }
            }
        }

        int bgResId = prefs.getInt("selectedBackground", R.drawable.tiles_grass);
        JSONObject bgObj = new JSONObject();
        try { bgObj.put("resId", bgResId); bgObj.put("isBackground", true); array.put(bgObj); }
        catch (Exception ignored) {}

        prefs.edit().putString(key, array.toString()).apply();
```
로 전체 변경

(11)
```
private void applyInventoryItem(Intent intent) {
```
안에

```
// 현재 카메라 오프셋 즉시 계산해서 월드좌표 산출
                int[] cam = spriteView != null ? spriteView.computeCurrentCameraLT() : new int[]{cameraLeft, cameraTop};
                float camLeftNow = cam[0];
                float camTopNow  = cam[1];

                float initialScreenX = 300f;
                float initialScreenY = 100f;
                float worldX = initialScreenX + camLeftNow;
                float worldY = initialScreenY + camTopNow;

                if (isAnimalRes(resId)) {
                    addAnimalToFarmAreaWorld(resId, worldX, worldY, 120, 120, 0f);
                } else {
                    addItemToFarmAreaWorld(resId, worldX, worldY, 120, 120, 0f);
                }

                // 즉시 반영
                applyCameraToAllItems();
                applyWorldBoundsToAnimals();

                saveAppliedItems();
                setEditMode(true);
```
삭제하고

```
int[] cam = spriteView != null ? spriteView.computeCurrentCameraLT() : new int[]{cameraLeft, cameraTop};
                float worldX = 300f + cam[0], worldY = 100f + cam[1];

                if (isAnimalRes(resId)) addAnimalToFarmAreaWorld(resId, worldX, worldY, 120, 120, 0f);
                else addItemToFarmAreaWorld(resId, worldX, worldY, 120, 120, 0f);

                applyCameraToAllItems(); applyWorldBoundsToAnimals();
                saveAppliedItems(); setEditMode(true);
```
로 변경

(12)
```
private void addItemToFarmAreaWorld(int resId, float worldX, float worldY, int width, int height, float rotation) {
```
여기 안에

```
SelectableItemView itemView = new SelectableItemView(this, resId);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(width, height);
        itemView.setLayoutParams(params);
        itemView.setRotation(rotation);

        // 카메라/월드 초기화
        itemView.setCameraOffset(cameraLeft, cameraTop);
        itemView.setWorldPosition(worldX, worldY);

        itemView.setOnDoubleTapListener(() -> showDeleteConfirmDialog(itemView));
        itemView.setEditEnabled(isEditMode);
        if (isEditMode) itemView.showBorderAndButtons(); else itemView.hideBorderAndButtons();

        // 드래그 종료 시 월드 좌표 갱신
        itemView.setOnDragEndListener(v -> {
            v.setCameraOffset(cameraLeft, cameraTop);
            v.updateWorldFromScreen();
        });

        farmArea.addView(itemView);
```
삭제하고

```
SelectableItemView v = new SelectableItemView(this, resId);
        FrameLayout.LayoutParams p = new FrameLayout.LayoutParams(width, height);
        v.setLayoutParams(p); v.setRotation(rotation);
        v.setCameraOffset(cameraLeft, cameraTop); v.setWorldPosition(worldX, worldY);
        v.setOnDoubleTapListener(() -> showDeleteConfirmDialog(v));
        v.setEditEnabled(isEditMode); if (isEditMode) v.showBorderAndButtons(); else v.hideBorderAndButtons();
        v.setOnDragEndListener(iv -> { iv.setCameraOffset(cameraLeft, cameraTop); iv.updateWorldFromScreen(); });
        farmArea.addView(v);
```
로 붙여넣기

(13)
```
private void addAnimalToFarmAreaWorld(int resId, float worldX, float worldY, int width, int height, float rotation) {
```
여기 안에 전체를

```
SelectableSpriteItemView itemView = new SelectableSpriteItemView(this, resId);
        String entryName = safeEntryName(resId);
        if ("chicken".equals(entryName)) {
            int rows = 13, cols = 8; int[] idleRows = new int[]{10, 11};
            int[][] ex = new int[rows][];
            ex[0]=new int[]{5,6,7,8}; ex[1]=new int[]{}; ex[2]=new int[]{};
            ex[3]=new int[]{}; ex[4]=new int[]{}; ex[5]=new int[]{}; ex[6]=new int[]{};
            ex[7]=new int[]{6,7,8}; ex[8]=new int[]{5,6,7,8}; ex[9]=new int[]{6,7,8}; ex[10]=new int[]{5,6,7,8};
            ex[11]=new int[]{7,8}; ex[12]=new int[]{3,4,5,6,7,8};
            boolean[][] base = makeIncludeMask(rows, cols, ex);
            boolean[][] idle = filterRows(base, rows, cols, idleRows);
            boolean[][] walk = subtractMasks(base, idle);
            itemView.applyDualSpriteWithMasks(R.drawable.chicken_sprites, rows, cols, 8, 6, walk, idle);

        } else if ("cow".equals(entryName)) {
            int rows = 7, cols = 8;
            int[][] ex = new int[rows][];
            ex[0]=new int[]{4,5,6,7,8}; ex[1]=new int[]{}; ex[2]=new int[]{8}; ex[3]=new int[]{4,5,6,7,8};
            ex[4]=new int[]{5,6,7,8}; ex[5]=new int[]{8}; ex[6]=new int[]{5,6,7,8};
            boolean[][] base = makeIncludeMask(rows, cols, ex);
            boolean[][] idle = new boolean[rows][cols];
            int r3=2; for (int c1 : new int[]{1,3}) { int c=c1-1; if (c>=0&&c<cols&&base[r3][c]) idle[r3][c]=true; }
            int r4=3; for (int c=0;c<cols;c++) if (base[r4][c]) idle[r4][c]=true;
            int r5=4; for (int c=0;c<cols;c++) if (base[r5][c]) idle[r5][c]=true;
            int r7=6; for (int c=0;c<cols;c++) if (base[r7][c]) idle[r7][c]=true;
            boolean[][] walk = subtractMasks(base, idle);
            itemView.applyDualSpriteWithMasks(R.drawable.cow_sprites, rows, cols, 8, 6, walk, idle);

        } else {
            addItemToFarmAreaWorld(resId, worldX, worldY, width, height, rotation);
            return;
        }

        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(width, height);
        itemView.setLayoutParams(params); itemView.setRotation(rotation);
        itemView.setCameraOffset(cameraLeft, cameraTop); itemView.setWorldPosition(worldX, worldY);

        int worldW = spriteView.getWorldWidth(); int worldH = spriteView.getWorldHeight();
        itemView.setWorldBounds(worldW, worldH);

        itemView.setOnDoubleTapListener(() -> showDeleteConfirmDialog(itemView));
        itemView.setEditEnabled(isEditMode); if (isEditMode) itemView.showBorderAndButtons(); else itemView.hideBorderAndButtons();
        farmArea.addView(itemView);

        if (!isEditMode) { itemView.enableWander(farmArea); itemView.setWanderSpeed(15f); }

        itemView.setOnDragEndListener(v -> { v.setCameraOffset(cameraLeft, cameraTop); v.updateWorldFromScreen(); });
```
로 바꾸기

(14)
```
// ====== 마스크 유틸 ======
    private static boolean[][] makeIncludeMask(int rows, int cols, int[][] excludedCols1Based) {
        boolean[][] mask = new boolean[rows][cols];
        for (int r=0;r<rows;r++) for (int c=0;c<cols;c++) mask[r][c]=true;
        if (excludedCols1Based != null) {
            for (int r=0;r<rows;r++) {
                int[] ex = excludedCols1Based[r];
                if (ex == null) continue;
                for (int col1 : ex) {
                    int c = col1 - 1;
                    if (c>=0 && c<cols) mask[r][c] = false;
                }
            }
        }
        return mask;
    }
    private static boolean[][] filterRows(boolean[][] baseMask, int rows, int cols, int[] keepRows) {
        boolean[] keep = new boolean[rows];
        for (int r : keepRows) if (r>=0 && r<rows) keep[r]=true;
        boolean[][] out = new boolean[rows][cols];
        for (int r=0;r<rows;r++) if (keep[r]) for (int c=0;c<cols;c++) out[r][c]=baseMask[r][c];
        return out;
    }
    private static boolean[][] subtractMasks(boolean[][] baseMask, boolean[][] idleMask) {
        int rows = baseMask.length;
        int cols = baseMask[0].length;
        boolean[][] out = new boolean[rows][cols];
        for (int r=0;r<rows;r++) for (int c=0;c<cols;c++) {
            out[r][c] = baseMask[r][c] && !(idleMask != null && idleMask[r][c]);
        }
        return out;
    }
```
여기를 전부 삭제하고

```
private static boolean[][] makeIncludeMask(int rows, int cols, int[][] excludedCols1Based) {
        boolean[][] mask = new boolean[rows][cols];
        for (int r=0;r<rows;r++) for (int c=0;c<cols;c++) mask[r][c]=true;
        if (excludedCols1Based != null) {
            for (int r=0;r<rows;r++) {
                int[] ex = excludedCols1Based[r]; if (ex == null) continue;
                for (int col1 : ex) { int c = col1 - 1; if (c>=0 && c<cols) mask[r][c] = false; }
            }
        }
        return mask;
    }
    private static boolean[][] filterRows(boolean[][] baseMask, int rows, int cols, int[] keepRows) {
        boolean[] keep = new boolean[rows]; for (int r : keepRows) if (r>=0 && r<rows) keep[r]=true;
        boolean[][] out = new boolean[rows][cols];
        for (int r=0;r<rows;r++) if (keep[r]) for (int c=0;c<cols;c++) out[r][c]=baseMask[r][c];
        return out;
    }
    private static boolean[][] subtractMasks(boolean[][] baseMask, boolean[][] idleMask) {
        int rows = baseMask.length, cols = baseMask[0].length;
        boolean[][] out = new boolean[rows][cols];
        for (int r=0;r<rows;r++) for (int c=0;c<cols;c++) out[r][c] = baseMask[r][c] && !(idleMask!=null && idleMask[r][c]);
        return out;
    }
```
이거를 붙여 넣기

(15)
```
private boolean isAnimalRes(int resId) {
        String name = safeEntryName(resId);
        return "chicken".equals(name) || "cow".equals(name);
    }

    private String safeEntryName(int resId) {
        try {
            return getResources().getResourceEntryName(resId);
        } catch (Exception e) {
            return "";
        }
    }
```
여기를 전부 삭제하고 그 자리에

```
private boolean isAnimalRes(int resId) {
        String name = safeEntryName(resId);
        return "chicken".equals(name) || "cow".equals(name);
    }
    private String safeEntryName(int resId) {
        try { return getResources().getResourceEntryName(resId); } catch (Exception e) { return ""; }
    }
```
이거 붙여넣기

(16)

맨 아래에

```
// 배경(월드) 전체 크기를 모든 동물에게 전달
    private void applyWorldBoundsToAnimals() {
        if (spriteView == null) return;
        int worldW = spriteView.getWorldWidth();
        int worldH = spriteView.getWorldHeight();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableSpriteItemView) {
                ((SelectableSpriteItemView) child).setWorldBounds(worldW, worldH);
            }
        }
    }
```
여기 밑에 아래 내용 추가

```
// ===== Fence 설치 모드 =====
    private void enterFenceMode(int atlasResId) {
        exitFenceMode();
        fenceAtlas = new FenceAtlas(this, atlasResId);

        fenceOverlay = new FencePlacerOverlay(this, GRID_PX, masks -> commitFences(masks, atlasResId));
        fenceOverlay.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        fenceOverlay.setCamera(cameraLeft, cameraTop);

        View editBtn  = findViewById(R.id.editModeButton);
        View doneBtn  = findViewById(R.id.editCompleteButton);
        View resetBtn = findViewById(R.id.resetButton);
        fenceOverlay.setExclusionViews(editBtn, doneBtn, resetBtn);

        fenceModeBar = buildTopBar(
                "설치 완료",
                v -> {
                    commitRanchDoorCellsIfAny(atlasResId); // 남은 게이트 위치 커밋
                    saveAppliedItems();
                    exitFenceMode();
                    Toast.makeText(this, "울타리 설치 모드를 종료했습니다.", Toast.LENGTH_SHORT).show();
                },
                "설치 모드 취소",
                v -> {
                    ranchDoorCellsBuffer.clear();
                    if (fenceOverlay != null) fenceOverlay.clearGateCells();
                    exitFenceMode();
                    Toast.makeText(this, "설치 모드를 취소했습니다.", Toast.LENGTH_SHORT).show();
                }
        );

        // 게이트 배치 버튼 (기존 게이트 유지)
        Button btnGate = new Button(this);
        btnGate.setAllCaps(false);
        btnGate.setText(ranchDoorPlacementOn ? "문 배치 ON" : "문 배치 OFF");
        btnGate.setOnClickListener(v -> {
            ranchDoorPlacementOn = !ranchDoorPlacementOn;
            fenceOverlay.setGateMode(ranchDoorPlacementOn); // 탭 좌표 수집
            btnGate.setText(ranchDoorPlacementOn ? "문 배치 ON" : "문 배치 OFF");

            if (!ranchDoorPlacementOn && !fenceOverlay.getGateCells().isEmpty()) {
                // 꺼질 때 수집분 즉시 커밋
                Map<Point,Integer> toCommit = new HashMap<>();
                for (Point p : fenceOverlay.getGateCells()) toCommit.put(new Point(p), 0);
                commitFences(toCommit, atlasResId);
                fenceOverlay.clearGateCells();
            }
        });
        fenceModeBar.addView(btnGate, 0);

        farmArea.addView(fenceOverlay);
        farmArea.addView(fenceModeBar);
        Toast.makeText(this, "설치할 위치를 드래그하여 배치하세요.", Toast.LENGTH_SHORT).show();
    }

    private void exitFenceMode() {
        if (fenceModeBar != null) { farmArea.removeView(fenceModeBar); fenceModeBar = null; }
        if (fenceOverlay != null) {
            ranchDoorCellsBuffer.addAll(fenceOverlay.getGateCells());
            fenceOverlay.clearGateCells();
            fenceOverlay.setGateMode(false);
            farmArea.removeView(fenceOverlay);
            fenceOverlay = null;
        }
        ranchDoorPlacementOn = false;
        if (fenceAtlas != null) { fenceAtlas.dispose(); fenceAtlas = null; }
    }

    private void commitRanchDoorCellsIfAny(int atlasResId) {
        HashSet<Point> left = new HashSet<>(ranchDoorCellsBuffer);
        if (fenceOverlay != null) left.addAll(fenceOverlay.getGateCells());
        if (left.isEmpty()) return;

        Map<Point,Integer> toCommit = new HashMap<>();
        for (Point p : left) toCommit.put(new Point(p), 0);
        ranchDoorCellsBuffer.clear();
        if (fenceOverlay != null) fenceOverlay.clearGateCells();

        commitFences(toCommit, atlasResId);
    }

    private void commitFences(Map<Point, Integer> cells, int atlasResId) {
        if (fenceAtlas == null) return;

        HashMap<String, SelectableFenceView> current = collectFenceMapByAtlas(atlasResId);

        for (Map.Entry<Point,Integer> e : cells.entrySet()) {
            Point cell = e.getKey();
            int gx = cell.x, gy = cell.y;

            boolean isGateCell = (fenceOverlay != null && fenceOverlay.getGateCells().contains(cell))
                    || ranchDoorCellsBuffer.contains(cell);

            if (isGateCell) {
                // 방향 추론: 위/아래에 울타리가 있고 좌/우가 비면 세로, 아니면 가로
                boolean vertical = isGateVerticalSpot(current, gx, gy);
                placeGateGroup(gx, gy, atlasResId, vertical); // ★ 기존 게이트 배치 유지
                continue;
            }

            float worldX = gx * GRID_PX + cameraLeft;
            float worldY = gy * GRID_PX + cameraTop;

            SelectableFenceView fv = new SelectableFenceView(
                    this, fenceAtlas.getByMask(0), fenceDisplaySizePx, 0, atlasResId
            );
            fv.setFenceGridCell(gx, gy);
            fv.setFenceMode(true);
            fv.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
            fv.setCameraOffset(cameraLeft, cameraTop);
            fv.setWorldPosition(worldX, worldY);
            fv.setEditEnabled(isEditMode);
            if (isEditMode) fv.showBorderAndButtons(); else fv.hideBorderAndButtons();

            fv.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView) v));
            fv.setScaleX(0.6f); fv.setScaleY(0.6f); fv.setAlpha(0f);
            farmArea.addView(fv);
            fv.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(160).start();
        }

        recalcAllGridMasks();
    }

    private void onFenceDragEnd(SelectableFenceView v) {
        v.updateWorldFromScreen();
        int gx = Math.round(v.getWorldX() / GRID_PX);
        int gy = Math.round(v.getWorldY() / GRID_PX);
        v.setFenceGridCell(gx, gy);
        v.setWorldPosition(gx * GRID_PX, gy * GRID_PX);
        v.setCameraOffset(cameraLeft, cameraTop);
        recalcAllGridMasks();
        saveAppliedItems();
    }

    // ===== House/Ranch-Structure 설치 모드 =====
    private void enterHouseMode(int atlasResId, String okTextFromCaller) {
        exitHouseMode();
        houseAtlas = new HouseAtlas(this, atlasResId, 16);

        isRanchBuild = false;
        if (okTextFromCaller != null) {
            String t = okTextFromCaller.toLowerCase();
            if (t.contains("목장") || t.contains("축사") || t.contains("외양간")
                    || t.contains("ranch") || t.contains("barn") || t.contains("stable")) {
                isRanchBuild = true;
            }
        }

        houseOverlay = new FencePlacerOverlay(this, GRID_PX, masks -> commitHouseWalls(masks, atlasResId));
        houseOverlay.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        houseOverlay.setCamera(cameraLeft, cameraTop);

        View editBtn  = findViewById(R.id.editModeButton);
        View doneBtn  = findViewById(R.id.editCompleteButton);
        View resetBtn = findViewById(R.id.resetButton);
        houseOverlay.setExclusionViews(editBtn, doneBtn, resetBtn);

        final String okText = "설치 완료";

        houseModeBar = buildTopBar(
                okText,
                v -> {
                    commitHouseDoorCellsIfAny(atlasResId);
                    saveAppliedItems(); exitHouseMode();
                    Toast.makeText(this,
                            (isRanchBuild ? "목장 설치를 완료했습니다." : "집 설치를 완료했습니다."),
                            Toast.LENGTH_SHORT).show();
                },
                "설치 모드 취소",
                v -> { houseDoorCellsBuffer.clear();
                    if (houseOverlay != null) houseOverlay.clearGateCells();
                    exitHouseMode();
                    Toast.makeText(this, "설치 모드를 취소했습니다.", Toast.LENGTH_SHORT).show(); }
        );

        // 집/구조물 문 배치 버튼
        Button btnDoor = new Button(this);
        btnDoor.setAllCaps(false);
        btnDoor.setText(houseDoorPlacementOn ? "문 배치 ON" : "문 배치 OFF");
        btnDoor.setOnClickListener(v -> {
            houseDoorPlacementOn = !houseDoorPlacementOn;
            houseOverlay.setGateMode(houseDoorPlacementOn);
            btnDoor.setText(houseDoorPlacementOn ? "문 배치 ON" : "문 배치 OFF");

            if (!houseDoorPlacementOn && !houseOverlay.getGateCells().isEmpty()) {
                for (Point p : houseOverlay.getGateCells()) placeHouseDoor(p.x, p.y, atlasResId);
                houseOverlay.clearGateCells();
                recalcAllGridMasks();
            }
        });
        houseModeBar.addView(btnDoor, 0);

        farmArea.addView(houseOverlay);
        farmArea.addView(houseModeBar);
        Toast.makeText(this, "설치할 위치를 드래그하여 배치하세요.", Toast.LENGTH_SHORT).show();
    }

    private void exitHouseMode() {
        if (houseModeBar != null) { farmArea.removeView(houseModeBar); houseModeBar = null; }
        if (houseOverlay != null) {
            houseDoorCellsBuffer.addAll(houseOverlay.getGateCells());
            houseOverlay.clearGateCells();
            houseOverlay.setGateMode(false);
            farmArea.removeView(houseOverlay); houseOverlay = null;
        }
        houseDoorPlacementOn = false;
        if (houseAtlas != null) { houseAtlas.dispose(); houseAtlas = null; }
    }

    private void commitHouseDoorCellsIfAny(int atlasResId) {
        HashSet<Point> left = new HashSet<>(houseDoorCellsBuffer);
        if (houseOverlay != null) left.addAll(houseOverlay.getGateCells());
        if (left.isEmpty()) return;

        for (Point p : left) placeHouseDoor(p.x, p.y, atlasResId);
        houseDoorCellsBuffer.clear();
        if (houseOverlay != null) houseOverlay.clearGateCells();
        recalcAllGridMasks();
    }

    private void commitHouseWalls(Map<Point, Integer> cells, int atlasResId) {
        if (houseAtlas == null) return;

        for (Map.Entry<Point,Integer> e : cells.entrySet()) {
            Point cell = e.getKey();
            int gx = cell.x, gy = cell.y;

            boolean isDoorCell = (houseOverlay != null && houseOverlay.getGateCells().contains(cell))
                    || houseDoorCellsBuffer.contains(cell);
            if (isDoorCell) { placeHouseDoor(gx, gy, atlasResId); continue; }

            float worldX = gx * GRID_PX + cameraLeft;
            float worldY = gy * GRID_PX + cameraTop;

            SelectableFenceView wall = new SelectableFenceView(
                    this, houseAtlas.getByMask(1|2), fenceDisplaySizePx, 0, atlasResId
            );
            wall.setFenceGridCell(gx, gy);
            wall.setFenceMode(true);
            wall.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
            wall.setCameraOffset(cameraLeft, cameraTop);
            wall.setWorldPosition(worldX, worldY);
            wall.setEditEnabled(isEditMode);
            if (isEditMode) wall.showBorderAndButtons(); else wall.hideBorderAndButtons();
            wall.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView)v));

            wall.setScaleX(0.6f); wall.setScaleY(0.6f); wall.setAlpha(0f);
            farmArea.addView(wall);
            wall.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(160).start();
        }

        recalcAllGridMasks();
    }

    private LinearLayout buildTopBar(String okText, View.OnClickListener ok, String cancelText, View.OnClickListener cancel) {
        LinearLayout bar = new LinearLayout(this);
        bar.setOrientation(LinearLayout.VERTICAL);
        bar.setPadding(dp(8), dp(8), dp(8), dp(8));
        bar.setPadding(dp(8), dp(8), dp(8), dp(8));
        bar.setBackgroundColor(0xAAFFFFFF);
        bar.setElevation(dp(2));
        FrameLayout.LayoutParams barLp = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        barLp.gravity = Gravity.TOP | Gravity.START;
        barLp.topMargin = dp(16); barLp.leftMargin = dp(16);
        bar.setLayoutParams(barLp);


        Button btnOk = new Button(this);
        btnOk.setText(okText); btnOk.setAllCaps(false); btnOk.setOnClickListener(ok);
        shrinkButton(btnOk);

        Button btnCancel = new Button(this);
        btnCancel.setText(cancelText); btnCancel.setAllCaps(false); btnCancel.setOnClickListener(cancel);
        shrinkButton(btnCancel);

        bar.addView(btnOk);
        bar.addView(btnCancel);
        return bar;

    }

    /** 울타리/집벽 공통: atlas 그룹별로 이웃 연결 재계산 + 문/게이트 프레임 적용 */
    private void recalcAllGridMasks() {
        HashMap<Integer, HashMap<String, SelectableFenceView>> byAtlas = new HashMap<>();

        // floor(mask>15)는 이웃 계산에서 제외
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableFenceView) {
                SelectableFenceView fv = (SelectableFenceView) child;
                Integer mk = fv.getFenceMaskTag();
                if (mk != null && mk > 15) continue;

                Integer gx = fv.getFenceGridXTag(), gy = fv.getFenceGridYTag();
                if (gx == null || gy == null) {
                    gx = Math.round(fv.getWorldX() / GRID_PX);
                    gy = Math.round(fv.getWorldY() / GRID_PX);
                    fv.setFenceGridCell(gx, gy);
                }
                int atlas = fv.getAtlasResId();
                byAtlas.putIfAbsent(atlas, new HashMap<>());
                byAtlas.get(atlas).put(gx + "," + gy, fv);
            }
        }
        if (byAtlas.isEmpty()) return;

        final int U=1,R=2,D=4,L=8;
        ArrayList<SelectableFenceView> toRemove = new ArrayList<>();

        for (Map.Entry<Integer, HashMap<String, SelectableFenceView>> entry : byAtlas.entrySet()) {
            int atlasResId = entry.getKey();
            HashMap<String, SelectableFenceView> map = entry.getValue();

            boolean isHouse = isHouseAtlas(atlasResId);

            FenceAtlas tmpFence = null;
            HouseAtlas tmpHouse = null;
            if (isHouse) tmpHouse = (houseAtlas != null ? houseAtlas : new HouseAtlas(this, atlasResId, 16));
            else         tmpFence = (fenceAtlas != null ? fenceAtlas : new FenceAtlas(this, atlasResId));

            for (SelectableFenceView fv : map.values()) {
                int gx = fv.getFenceGridXTag(), gy = fv.getFenceGridYTag();
                int m = computeMaskAt(map, gx, gy);

                // === 집/구조물 문 처리 ===
                if (Boolean.TRUE.equals(fv.getTag(TAG_IS_DOOR))) {
                    ensureDoorSpritesLoaded();
                    if (doorSheet != null) {
                        int frameIdx = getDoorFrameIndex(fv);
                        Integer sliceIdx = (Integer) fv.getTag(TAG_DOOR_SLICE);
                        if (sliceIdx == null) sliceIdx = 0;
                        String tp = String.valueOf(fv.getTag(TAG_DOOR_TYPE));
                        Bitmap bmp = "RANCH".equals(tp)
                                ? safeRanchSlice(frameIdx, sliceIdx)
                                : safeHouseFrame(frameIdx);
                        fv.setFenceMaskAndBitmap(m, bmp);

                        if (!isDoorListenerAttached(fv)) {
                            Object grp = fv.getTag(TAG_DOOR_GROUP);
                            if (grp != null && sliceIdx == 0) {
                                String gid = grp.toString();
                                fv.setOnClickListener(v -> animateDoorToggleByGroup(gid));
                                fv.setTag(TAG_DOOR_LISTENER, Boolean.TRUE);
                            } else fv.setOnClickListener(null);
                        }
                        continue;
                    }
                }

                // === 울타리 게이트 처리(기존 유지) ===
                if (Boolean.TRUE.equals(fv.getTag(TAG_KEY_GATE))) {
                    ensureGateSlicesLoaded();
                    if (gateHFrameSlices != null && gateVFrameSlices != null) {
                        boolean verticalNow = (m == (U|D));
                        fv.setTag(TAG_KEY_GATE_VERTICAL, verticalNow);

                        int frameIdx = getGateFrameIndex(fv);
                        Integer sliceIdx = (Integer) fv.getTag(TAG_KEY_GATE_SLICE);
                        if (sliceIdx == null) sliceIdx = 0;

                        Bitmap bmp = verticalNow
                                ? safeVSlice(frameIdx, sliceIdx)
                                : safeHSlice(frameIdx, sliceIdx);
                        fv.setFenceMaskAndBitmap(m, bmp);

                        if (!isGateListenerAttached(fv)) {
                            Object grp = fv.getTag(TAG_KEY_GATE_GROUP);
                            if (grp != null && sliceIdx == 0) {
                                String gid = grp.toString();
                                fv.setOnClickListener(v -> animateGateToggleByGroup(gid));
                                fv.setTag(TAG_KEY_GATE_LISTENER, Boolean.TRUE);
                            } else fv.setOnClickListener(null);
                        }
                    }
                    continue;
                }

                // === 일반 울타리/집벽 ===
                if (isHouse && m == 0) { // 고립 제거
                    toRemove.add(fv);
                    continue;
                }

                if (isHouse) {
                    if (m == (U|D)) {
                        int side = inferVerticalSide(map, gx, gy);
                        Bitmap bm =
                                side > 0 ? tmpHouse.getVerticalRight()
                                        : side < 0 ? tmpHouse.getVerticalLeft()
                                        : tmpHouse.getByMask(m);
                        fv.setFenceMaskAndBitmap(m, bm);
                    } else {
                        fv.setFenceMaskAndBitmap(m, tmpHouse.getByMask(m));
                    }
                } else {
                    fv.setFenceMaskAndBitmap(m, tmpFence.getByMask(m));
                }
            }

            for (SelectableFenceView v : toRemove) farmArea.removeView(v);
            toRemove.clear();

            if (isHouse) fillHouseFloor(atlasResId, map, tmpHouse);
        }
    }

    private HashMap<String, SelectableFenceView> collectFenceMapByAtlas(int atlasResId) {
        HashMap<String, SelectableFenceView> map = new HashMap<>();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableFenceView) {
                SelectableFenceView fv = (SelectableFenceView) child;
                if (fv.getAtlasResId() != atlasResId) continue;
                Integer mk = fv.getFenceMaskTag();
                if (mk != null && mk > 15) continue;
                Integer gx = fv.getFenceGridXTag(), gy = fv.getFenceGridYTag();
                if (gx == null || gy == null) continue;
                map.put(gx + "," + gy, fv);
            }
        }
        return map;
    }

    private boolean isGateVerticalSpot(HashMap<String, SelectableFenceView> map, int gx, int gy) {
        boolean up    = map.containsKey(gx + "," + (gy-1));
        boolean down  = map.containsKey(gx + "," + (gy+1));
        boolean left  = map.containsKey((gx-1) + "," + gy);
        boolean right = map.containsKey((gx+1) + "," + gy);
        if ((up || down) && !(left || right)) return true;
        return false;
    }

    private int computeMaskAt(HashMap<String, SelectableFenceView> map, int gx, int gy) {
        final int U=1,R=2,D=4,L=8;
        int m=0;
        if (map.containsKey(gx + "," + (gy-1))) m |= U;
        if (map.containsKey((gx+1) + "," + gy)) m |= R;
        if (map.containsKey(gx + "," + (gy+1))) m |= D;
        if (map.containsKey((gx-1) + "," + gy)) m |= L;
        return m;
    }

    private int inferVerticalSide(HashMap<String, SelectableFenceView> map, int gx, int gy) {
        final int U=1,R=2,D=4,L=8;
        int y = gy-1;
        while (map.containsKey(gx + "," + y)) {
            int mm = computeMaskAt(map, gx, y);
            if (mm != (U|D)) {
                if ((mm & R) != 0) return +1;
                if ((mm & L) != 0) return -1;
                break;
            }
            y--;
        }
        y = gy+1;
        while (map.containsKey(gx + "," + y)) {
            int mm = computeMaskAt(map, gx, y);
            if (mm != (U|D)) {
                if ((mm & R) != 0) return +1;
                if ((mm & L) != 0) return -1;
                break;
            }
            y++;
        }
        return 0;
    }

    private void fillHouseFloor(int atlasResId,
                                HashMap<String, SelectableFenceView> wallMap,
                                HouseAtlas atlas) {
        // 1) 기존 floor(mask>15) 제거
        ArrayList<View> floorToRemove = new ArrayList<>();
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableFenceView) {
                SelectableFenceView fv = (SelectableFenceView) child;
                if (fv.getAtlasResId() == atlasResId) {
                    Integer mk = fv.getFenceMaskTag();
                    if (mk != null && mk > 15) floorToRemove.add(fv);
                }
            }
        }
        for (View v : floorToRemove) farmArea.removeView(v);

        if (wallMap.isEmpty()) return;

        // 2) 경계 박스 계산
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (String k : wallMap.keySet()) {
            String[] s = k.split(",");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            if (x < minX) minX = x; if (x > maxX) maxX = x;
            if (y < minY) minY = y; if (y > maxY) maxY = y;
        }
        minX -= 1; minY -= 1; maxX += 1; maxY += 1;

        int W = maxX - minX + 1;
        int H = maxY - minY + 1;

        // 3) 점유 맵(벽)
        boolean[][] occ = new boolean[H][W];
        for (String k : wallMap.keySet()) {
            String[] s = k.split(",");
            int gx = Integer.parseInt(s[0]) - minX;
            int gy = Integer.parseInt(s[1]) - minY;
            if (gy>=0 && gy<H && gx>=0 && gx<W) occ[gy][gx] = true;
        }

        // 4) 문/게이트도 막힌 셀로 간주 (바닥 새어보임 방지)
        for (int i = 0; i < farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (!(child instanceof SelectableFenceView)) continue;
            SelectableFenceView f = (SelectableFenceView) child;

            Integer mk = f.getFenceMaskTag();
            if (mk != null && mk > 15) continue;

            Integer gxTag = f.getFenceGridXTag(), gyTag = f.getFenceGridYTag();
            if (gxTag == null || gyTag == null) continue;

            boolean blocks = false;
            // 같은 atlas의 벽/타일
            if (f.getAtlasResId() == atlasResId) blocks = true;
            // 집/구조물 문
            if (Boolean.TRUE.equals(f.getTag(TAG_IS_DOOR))) blocks = true;
            // (선택) 울타리 게이트가 내부 사각에 들어온 경우도 차단
            if (Boolean.TRUE.equals(f.getTag(TAG_KEY_GATE))) blocks = true;

            if (blocks
                    && gxTag >= minX && gxTag <= maxX
                    && gyTag >= minY && gyTag <= maxY) {
                occ[gyTag - minY][gxTag - minX] = true;
            }
        }

        // 5) 바깥 flood-fill
        boolean[][] outside = new boolean[H][W];
        ArrayDeque<int[]> dq = new ArrayDeque<>();
        for (int x=0;x<W;x++){ dq.add(new int[]{x,0}); dq.add(new int[]{x,H-1}); }
        for (int y=0;y<H;y++){ dq.add(new int[]{0,y}); dq.add(new int[]{W-1,y}); }
        int[] dx={1,-1,0,0}, dy={0,0,1,-1};
        while(!dq.isEmpty()){
            int[] p = dq.poll();
            int x=p[0], y=p[1];
            if (x<0||x>=W||y<0||y>=H) continue;
            if (outside[y][x] || occ[y][x]) continue;
            outside[y][x]=true;
            for (int i=0;i<4;i++) dq.add(new int[]{x+dx[i], y+dy[i]});
        }

        // 6) 내부에 바닥 채우기
        for (int gy=minY+1; gy<=maxY-1; gy++) {
            for (int gx=minX+1; gx<=maxX-1; gx++) {
                int ix = gx - minX, iy = gy - minY;
                if (ix<0||ix>=W||iy<0||iy>=H) continue;
                if (!occ[iy][ix] && !outside[iy][ix]) {
                    float worldX = gx * GRID_PX + cameraLeft;
                    float worldY = gy * GRID_PX + cameraTop;

                    SelectableFenceView floor = new SelectableFenceView(
                            this, atlas.getFloorBitmap(), fenceDisplaySizePx, 16, atlasResId
                    );
                    floor.setFenceGridCell(gx, gy);
                    floor.setFenceMode(true);
                    floor.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
                    floor.setCameraOffset(cameraLeft, cameraTop);
                    floor.setWorldPosition(worldX, worldY);
                    floor.setEditEnabled(isEditMode);
                    if (isEditMode) floor.showBorderAndButtons(); else floor.hideBorderAndButtons();
                    floor.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView)v));
                    farmArea.addView(floor);
                }
            }
        }
    }

    private boolean isHouseAtlas(int atlasResId) {
        try {
            String name = getResources().getResourceEntryName(atlasResId).toLowerCase();
            if (name.contains("fence")) return false;
            return name.contains("house") || name.contains("wall") || name.contains("structure") || name.contains("ranch") || name.contains("barn") || name.contains("stable");
        } catch (Exception e) {
            return false;
        }
    }
    private boolean isRanchStructureAtlas(int atlasResId) {
        try {
            String name = getResources().getResourceEntryName(atlasResId).toLowerCase();
            return name.contains("ranch") || name.contains("barn") || name.contains("stable") || name.contains("structure");
        } catch (Exception e) {
            return false;
        }
    }

    // =========================
    // [A] 울타리 게이트(기존) 스프라이트/유틸/배치/애니메이션
    // =========================
    private void ensureGateSlicesLoaded() {
        if (gateHFrameSlices != null && gateVFrameSlices != null) return;
        if (gateSheet == null) {
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inScaled = false;
            o.inPreferredConfig = Bitmap.Config.ARGB_8888;
            gateSheet = BitmapFactory.decodeResource(getResources(), R.drawable.fence_gates, o);
        }
        if (gateSheet == null) return;

        final int cell = 16;

        // 가로: row 0, 한 프레임은 4칸 → colStart=f*4, slice=0..3
        gateHFrameSlices = new Bitmap[5][4];
        for (int f=0; f<5; f++) {
            int colStart = f * 4;
            for (int s=0; s<4; s++) {
                gateHFrameSlices[f][s] = Bitmap.createBitmap(gateSheet, (colStart+s)*cell, 0*cell, cell, cell);
            }
        }

        // 세로: row 1~3, frame은 col={0,2,4,6,8}
        gateVFrameSlices = new Bitmap[5][3];
        int[] vCols = {0,2,4,6,8};
        for (int f=0; f<5; f++) {
            int col = vCols[f];
            for (int s=0; s<3; s++) { // 0..2 (row1, row2, row3)
                int row = 1 + s;
                gateVFrameSlices[f][s] = Bitmap.createBitmap(gateSheet, col*cell, row*cell, cell, cell);
            }
        }
    }
    private Bitmap safeHSlice(int frame, int slice) {
        frame = Math.max(0, Math.min(4, frame));
        slice = Math.max(0, Math.min(3, slice));
        return gateHFrameSlices[frame][slice];
    }
    private Bitmap safeVSlice(int frame, int slice) {
        frame = Math.max(0, Math.min(4, frame));
        slice = Math.max(0, Math.min(2, slice));
        return gateVFrameSlices[frame][slice];
    }
    private boolean isGateListenerAttached(SelectableFenceView v) {
        Object tag = v.getTag(TAG_KEY_GATE_LISTENER);
        return (tag instanceof Boolean) && (Boolean) tag;
    }
    private int getGateFrameIndex(SelectableFenceView v) {
        Object tag = v.getTag(TAG_KEY_GATE_FRAME);
        int t = 0;
        if (tag instanceof Integer) t = (Integer) tag;
        if (t < 0) t = 0; if (t > 4) t = 4;
        return t;
    }
    private void setGateFrameIndex(SelectableFenceView v, int idx) {
        if (idx < 0) idx = 0; if (idx > 4) idx = 4;
        v.setTag(TAG_KEY_GATE_FRAME, idx);
    }

    /** 게이트 묶음 설치: 가로(4칸) 또는 세로(5칸) */
    private void placeGateGroup(int gx, int gy, int atlasResId, boolean vertical) {
        ensureGateSlicesLoaded();
        if (gateHFrameSlices == null || gateVFrameSlices == null) return;

        String groupId = gx + "," + gy + (vertical ? ",GV" : ",GH");

        if (!vertical) {
            for (int s=0; s<4; s++) {
                int cx = gx + s, cy = gy;
                float wx = cx * GRID_PX + cameraLeft;
                float wy = cy * GRID_PX + cameraTop;

                SelectableFenceView part = new SelectableFenceView(
                        this, safeHSlice(0, s), fenceDisplaySizePx, 0, atlasResId
                );
                part.setFenceGridCell(cx, cy);
                part.setFenceMode(true);
                part.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
                part.setCameraOffset(cameraLeft, cameraTop);
                part.setWorldPosition(wx, wy);

                part.setTag(TAG_KEY_GATE, Boolean.TRUE);
                part.setTag(TAG_KEY_GATE_GROUP, groupId);
                part.setTag(TAG_KEY_GATE_SLICE, s);
                part.setTag(TAG_KEY_GATE_FRAME, 0);
                part.setTag(TAG_KEY_GATE_VERTICAL, Boolean.FALSE);
                part.setTag(TAG_KEY_GATE_OPENING, Boolean.FALSE);

                if (s == 0 && !isGateListenerAttached(part)) {
                    part.setOnClickListener(v -> animateGateToggleByGroup(groupId));
                    part.setTag(TAG_KEY_GATE_LISTENER, Boolean.TRUE);
                }

                part.setEditEnabled(isEditMode);
                if (isEditMode) part.showBorderAndButtons(); else part.hideBorderAndButtons();
                part.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView) v));

                farmArea.addView(part);
            }
        } else {
            for (int s=0; s<5; s++) {
                int cx = gx, cy = gy + s;
                float wx = cx * GRID_PX + cameraLeft;
                float wy = cy * GRID_PX + cameraTop;

                SelectableFenceView part = new SelectableFenceView(
                        this, safeVSlice(0, s), fenceDisplaySizePx, 0, atlasResId
                );
                part.setFenceGridCell(cx, cy);
                part.setFenceMode(true);
                part.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
                part.setCameraOffset(cameraLeft, cameraTop);
                part.setWorldPosition(wx, wy);

                part.setTag(TAG_KEY_GATE, Boolean.TRUE);
                part.setTag(TAG_KEY_GATE_GROUP, groupId);
                part.setTag(TAG_KEY_GATE_SLICE, s);
                part.setTag(TAG_KEY_GATE_FRAME, 0);
                part.setTag(TAG_KEY_GATE_VERTICAL, Boolean.TRUE);
                part.setTag(TAG_KEY_GATE_OPENING, Boolean.FALSE);

                if (s == 0 && !isGateListenerAttached(part)) {
                    part.setOnClickListener(v -> animateGateToggleByGroup(groupId));
                    part.setTag(TAG_KEY_GATE_LISTENER, Boolean.TRUE);
                }

                part.setEditEnabled(isEditMode);
                if (isEditMode) part.showBorderAndButtons(); else part.hideBorderAndButtons();
                part.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView) v));

                farmArea.addView(part);
            }
        }
    }

    /** 그룹 ID 기준으로 게이트 열림/닫힘 애니메이션 */
    private void animateGateToggleByGroup(String groupId) {
        ensureGateSlicesLoaded();
        if (gateHFrameSlices == null || gateVFrameSlices == null) return;

        ArrayList<SelectableFenceView> parts = new ArrayList<>();
        for (int i=0; i<farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableFenceView) {
                Object g = child.getTag(TAG_KEY_GATE_GROUP);
                if (g != null && groupId.equals(g.toString())) parts.add((SelectableFenceView) child);
            }
        }
        if (parts.isEmpty()) return;

        SelectableFenceView head = parts.get(0);
        boolean vertical = Boolean.TRUE.equals(head.getTag(TAG_KEY_GATE_VERTICAL));
        int cur = getGateFrameIndex(head);
        boolean opening = !(Boolean.TRUE.equals(head.getTag(TAG_KEY_GATE_OPENING)));
        for (SelectableFenceView p : parts) p.setTag(TAG_KEY_GATE_OPENING, opening);

        final boolean verticalF = vertical;
        final boolean openingF = opening;

        ui.post(new Runnable() {
            int idx = cur;
            @Override public void run() {
                if (openingF) { if (idx >= 4) return; idx++; }
                else          { if (idx <= 0) return; idx--; }

                for (SelectableFenceView p : parts) {
                    Integer slice = (Integer) p.getTag(TAG_KEY_GATE_SLICE);
                    if (slice == null) slice = 0;
                    Bitmap bmp = verticalF ? safeVSlice(idx, slice) : safeHSlice(idx, slice);

                    int m = 0; Integer mt = p.getFenceMaskTag(); if (mt != null) m = mt;
                    setGateFrameIndex(p, idx);
                    p.setFenceMaskAndBitmap(m, bmp);
                }
                ui.postDelayed(this, 60);
            }
        });
    }

    // =========================
    // [B] 집/목장 구조물 '문' 스프라이트 로더/유틸/배치/애니메이션
    // =========================
    private void ensureDoorSpritesLoaded() {
        if (houseDoorFrames != null && ranchDoorFrameSlices != null) return;
        if (doorSheet == null) {
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inScaled = false;
            o.inPreferredConfig = Bitmap.Config.ARGB_8888;
            doorSheet = BitmapFactory.decodeResource(getResources(), R.drawable.door_animation_sprites, o);
        }
        if (doorSheet == null) return;

        final int cell = 16;

        // 1행: 집 문(1칸) 6프레임
        houseDoorFrames = new Bitmap[DOOR_FRAMES];
        for (int f=0; f<DOOR_FRAMES; f++) {
            houseDoorFrames[f] = Bitmap.createBitmap(doorSheet, f*cell, 0, cell, cell);
        }

        // 2행: 목장 구조물 문(가로 3칸=48×16) 6프레임 → 각 프레임의 3조각
        ranchDoorFrameSlices = new Bitmap[DOOR_FRAMES][3];
        for (int f=0; f<DOOR_FRAMES; f++) {
            int colStart = f * 3;
            for (int s=0; s<3; s++) {
                ranchDoorFrameSlices[f][s] = Bitmap.createBitmap(doorSheet, (colStart+s)*cell, 1*cell, cell, cell);
            }
        }
    }
    private Bitmap safeHouseFrame(int frame) {
        if (houseDoorFrames == null) return null;
        frame = Math.max(0, Math.min(DOOR_FRAMES-1, frame));
        return houseDoorFrames[frame];
    }
    private Bitmap safeRanchSlice(int frame, int slice) {
        if (ranchDoorFrameSlices == null) return null;
        frame = Math.max(0, Math.min(DOOR_FRAMES-1, frame));
        slice = Math.max(0, Math.min(2, slice));
        return ranchDoorFrameSlices[frame][slice];
    }
    private boolean isDoorListenerAttached(SelectableFenceView v) {
        return Boolean.TRUE.equals(v.getTag(TAG_DOOR_LISTENER));
    }
    private int getDoorFrameIndex(SelectableFenceView v) {
        Object tag = v.getTag(TAG_DOOR_FRAME);
        int t = 5; // 기본 닫힘
        if (tag instanceof Integer) t = (Integer) tag;
        if (t < 0) t = 0; if (t > DOOR_FRAMES-1) t = DOOR_FRAMES-1;
        return t;
    }

    /** 집/구조물 문 설치: 목장은 3칸(48×16, row=1), 집은 1칸(16×16, row=0) */
    private void placeHouseDoor(int gx, int gy, int atlasResId) {
        ensureDoorSpritesLoaded();

        // ✅ 목장 여부 최종 판단: 설치 모드가 목장이면 무조건 3칸
        boolean useRanchDoor = isRanchBuild || isRanchStructureAtlas(atlasResId);

        if (useRanchDoor) {
            // 🔷 목장 문(가로 3칸) – door_animation_sprites 2행, 프레임 6 (0=활짝, 5=닫힘)
            String groupId = "R:" + gx + "," + gy;
            int startFrame = DOOR_FRAMES - 1; // 5=완전 닫힘에서 시작

            for (int s = 0; s < 3; s++) {
                int cx = gx + s, cy = gy;
                float wx = cx * GRID_PX + cameraLeft;
                float wy = cy * GRID_PX + cameraTop;

                SelectableFenceView part = new SelectableFenceView(
                        this, safeRanchSlice(startFrame, s), fenceDisplaySizePx, 0, atlasResId
                );
                part.setFenceGridCell(cx, cy);
                part.setFenceMode(true);
                part.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
                part.setCameraOffset(cameraLeft, cameraTop);
                part.setWorldPosition(wx, wy);

                part.setTag(TAG_IS_DOOR, Boolean.TRUE);
                part.setTag(TAG_DOOR_TYPE, "RANCH");
                part.setTag(TAG_DOOR_GROUP, groupId);
                part.setTag(TAG_DOOR_SLICE, s);
                part.setTag(TAG_DOOR_FRAME, startFrame);

                if (s == 0 && !isDoorListenerAttached(part)) {
                    part.setOnClickListener(v -> animateDoorToggleByGroup(groupId));
                    part.setTag(TAG_DOOR_LISTENER, Boolean.TRUE);
                }

                part.setEditEnabled(isEditMode);
                if (isEditMode) part.showBorderAndButtons(); else part.hideBorderAndButtons();
                part.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView) v));
                farmArea.addView(part);
            }
        } else {
            // 🔹 집 문(1칸) – door_animation_sprites 1행
            String groupId = "H:" + gx + "," + gy;
            int startFrame = DOOR_FRAMES - 1; // 5=완전 닫힘

            SelectableFenceView door = new SelectableFenceView(
                    this, safeHouseFrame(startFrame), fenceDisplaySizePx, 0, atlasResId
            );
            door.setFenceGridCell(gx, gy);
            door.setFenceMode(true);
            door.setLayoutParams(new FrameLayout.LayoutParams(GRID_PX, GRID_PX));
            door.setCameraOffset(cameraLeft, cameraTop);
            door.setWorldPosition(gx * GRID_PX + cameraLeft, gy * GRID_PX + cameraTop);

            door.setTag(TAG_IS_DOOR, Boolean.TRUE);
            door.setTag(TAG_DOOR_TYPE, "HOUSE");
            door.setTag(TAG_DOOR_GROUP, groupId);
            door.setTag(TAG_DOOR_SLICE, 0);
            door.setTag(TAG_DOOR_FRAME, startFrame);

            if (!isDoorListenerAttached(door)) {
                door.setOnClickListener(v -> animateDoorToggleByGroup(groupId));
                door.setTag(TAG_DOOR_LISTENER, Boolean.TRUE);
            }

            door.setEditEnabled(isEditMode);
            if (isEditMode) door.showBorderAndButtons(); else door.hideBorderAndButtons();
            door.setOnDragEndListener(v -> onFenceDragEnd((SelectableFenceView) v));
            farmArea.addView(door);
        }
    }


    /** 그룹 ID 단위로 집/구조물 문 열림/닫힘 애니메이션 */
    private void animateDoorToggleByGroup(String groupId) {
        ensureDoorSpritesLoaded();
        if (doorSheet == null) return;

        ArrayList<SelectableFenceView> parts = new ArrayList<>();
        for (int i=0; i<farmArea.getChildCount(); i++) {
            View child = farmArea.getChildAt(i);
            if (child instanceof SelectableFenceView) {
                Object g = child.getTag(TAG_DOOR_GROUP);
                if (g != null && groupId.equals(g.toString())) parts.add((SelectableFenceView) child);
            }
        }
        if (parts.isEmpty()) return;

        int cur = getDoorFrameIndex(parts.get(0));
        final boolean closing = (cur <= 2); // 0~2면 닫히는 방향 → 5

        ui.post(new Runnable() {
            int idx = cur;
            @Override public void run() {
                if (closing) {
                    if (idx >= DOOR_FRAMES-1) return; // 5
                    idx++;
                } else {
                    if (idx <= 0) return; // 0
                    idx--;
                }
                for (SelectableFenceView p : parts) {
                    p.setTag(TAG_DOOR_FRAME, idx);
                    int slice = 0; Object sl = p.getTag(TAG_DOOR_SLICE);
                    if (sl instanceof Integer) slice = (Integer) sl;
                    String tp = String.valueOf(p.getTag(TAG_DOOR_TYPE));
                    Bitmap bmp = "RANCH".equals(tp) ? safeRanchSlice(idx, slice) : safeHouseFrame(idx);
                    int m = 0; Integer mt = p.getFenceMaskTag(); if (mt != null) m = mt;
                    p.setFenceMaskAndBitmap(m, bmp);
                }
                ui.postDelayed(this, 70);
            }
        });
    }
```

4. SelectableItemView.java

(1)
```
// ★ 월드/카메라 상태
    private float worldX = 0f, worldY = 0f;
    private float cameraLeft = 0f, cameraTop = 0f;
```
여기 바로 밑에

```
// 커스텀 비트맵/울타리 태그
    private android.graphics.Bitmap customBitmap = null;
    private Integer fenceMaskTag = null;
    private Integer atlasResIdTag = null;
    private Integer fenceGridXTag = null; // 그리드 좌표 보존
    private Integer fenceGridYTag = null;

    // fence 전용 모드(버튼 숨김)
    private boolean isFenceMode = false;
```
추가

(2)
```
public int getResId() { return resId; }
```
여기 아래에

```
public Integer getFenceMaskTag() { return fenceMaskTag; }
    public Integer getAtlasResIdTag() { return atlasResIdTag; }
    public Integer getFenceGridXTag() { return fenceGridXTag; }
    public Integer getFenceGridYTag() { return fenceGridYTag; }

    public void setFenceGridCell(int gx, int gy) { this.fenceGridXTag = gx; this.fenceGridYTag = gy; }
    public void setFenceMode(boolean enable) {
        isFenceMode = enable;
        if (enable) { // 울타리는 회전/크기 버튼 숨김
            rotateButton.setVisibility(View.GONE);
            sizeIncreaseButton.setVisibility(View.GONE);
            sizeDecreaseButton.setVisibility(View.GONE);
        }
    }
```
추가

(3)
```
public void hideBorderAndButtons() {
        borderView.setVisibility(View.GONE);
        deleteButton.setVisibility(View.GONE);
```
여기 아래를

```
if (!isFenceMode) {
            rotateButton.setVisibility(View.GONE);
            sizeIncreaseButton.setVisibility(View.GONE);
            sizeDecreaseButton.setVisibility(View.GONE);
        } else {
            rotateButton.setVisibility(View.GONE);
            sizeIncreaseButton.setVisibility(View.GONE);
            sizeDecreaseButton.setVisibility(View.GONE);
        }
```
로 변경

(4)
```
public void showBorderAndButtons() {
        borderView.setVisibility(View.VISIBLE);
        deleteButton.setVisibility(View.VISIBLE);
```
여기 아래를

```
if (!isFenceMode) {
            rotateButton.setVisibility(View.VISIBLE);
            sizeIncreaseButton.setVisibility(View.VISIBLE);
            sizeDecreaseButton.setVisibility(View.VISIBLE);
        } else {
            rotateButton.setVisibility(View.GONE);
            sizeIncreaseButton.setVisibility(View.GONE);
            sizeDecreaseButton.setVisibility(View.GONE);
        }
        updateButtonSizes();
```
로 변경

(5)
```
public ImageView getItemImageView() { return itemImage; }
```
여기 아래에

```
public void setCustomBitmap(android.graphics.Bitmap bm, int atlasResIdTag, int fenceMaskTag) {
        this.customBitmap = bm;
        this.atlasResIdTag = atlasResIdTag;
        this.fenceMaskTag = fenceMaskTag;
        this.itemImage.setImageBitmap(bm);
    }
```
추가

5. SpriteView.java

```
private float speed = 5f;
```
를

```
private float speed = 7f;
```
로 변경

6. Tab4Activity.java

(1)
```
private void loadItems(String category) {
```
이 함수 부분을 아래로 통째로 변경

```
private void loadItems(String category) {
        itemList.clear();

        if (category.equals("농작물")) {
            String[] names = { "wheat","potato","cauliflower","beet","egg_plant",
                    "cabbage","corn","pumpkin","radish","blueberry",
                    "starfruit","pea","red_mushroom","red_spotted_mushroom",
                    "purple_mushroom","purple_spotted_mushroom" };
            for (String n : names) addIfExists(n, "농작물");

        } else if (category.equals("채집")) {
            String[] names = { "grass1","grass2","grass3","grass4",
                    "stone1","stone2","stone3","stone4","stone5","stone6",
                    "rock1","rock2","thin_tree","basic_tree","wide_tree",
                    "small_stump","basic_stump","big_stump",
                    "small_fallen_tree","big_fallen_tree" };
            for (String n : names) addIfExists(n, "채집");

        } else if (category.equals("장식물")) {
            String[] names = { "lotus","lilac","sunflower","blue_tulip","sky_blue_flower",
                    "blue_flower","beige_flower","heart_flower",
                    "small_bush","big_bush",
                    "long_wooden_path","wide_wooden_path",
                    "small_stone_path","long_stone_path","wide_stone_path",
                    "sign","left_diagonal_sign","right_diagonal_sign" };
            for (String n : names) addIfExists(n, "장식물");

        } else if (category.equals("피크닉")) {
            for (String n : new String[]{"basket","blanket"}) addIfExists(n, "피크닉");

        } else if (category.equals("구조물")) {
            for (String n : new String[]{"mailbox","water_well","boat"}) addIfExists(n, "구조물");

        } else if (category.equals("울타리")) {
            int resId = getResources().getIdentifier("fences", "drawable", getPackageName());
            if (resId == 0) resId = R.drawable.fences;
            itemList.add(new Item("fence_tool", "울타리", 0, resId, true));

        } else if (category.equals("배경")) {
            for (String n : new String[]{"tiles_grass","tiles_soil","tiles_stone"}) addIfExistsAs("배경", n, "배경");

        } else if (category.equals("먹이")) {
            int feedImageRes = getResources().getIdentifier("feed_item", "drawable", getPackageName());
            if (feedImageRes == 0) feedImageRes = R.drawable.feed_item;
            int count = prefs.getInt(KEY_FOOD_COUNT, 3);
            itemList.add(new Item("먹이 아이템", "먹이", count, feedImageRes, true));

        } else if (category.equals("동물")) {
            for (String n : new String[]{"chicken","cow"}) addIfExists(n, "동물");

        } else if (category.equals("목장_구조물")) {
            // chicken_house + 집 벽 빌더툴(목장 문구로 실행)
            addIfExists("chicken_house", "목장_구조물");
            int atlasResId = getResources().getIdentifier("wooden_house_walls", "drawable", getPackageName());
            if (atlasResId == 0) atlasResId = R.drawable.wooden_house_walls;
            itemList.add(new Item("house_wall_tool", "목장_구조물", 0, atlasResId, true));

        } else if (category.equals("사육")) {
            String[] names = { "straw","big_straw","haystack","big_haystack",
                    "basket_one","basket_two","water_tray","empty_water_tray" };
            for (String n : names) addIfExists(n, "사육");

        } else if (category.equals("기타")) {
            addIfExists("chest", "기타");

        } else if (category.equals("가구")) {
            String[] names = {
                    "bed_light_green","bed_pink","bed_skyblue",
                    "carpet","carpet_light_green","carpet_pink","carpet_skyblue",
                    "chair_behind","chair_front","chair_left","chair_right",
                    "clock","clock_edge","clock_bezel",
                    "frame_flower","frame_morning","frame_night",
                    "mood_light_light_green","mood_light_pink","mood_light_skyblue",
                    "nightstand",
                    "pot_blue_flower","pot_sprout","pot_sunflower",
                    "table_big","table_small"
            };
            for (String n : names) addIfExists(n, "가구");

        } else if (category.equals("건축물")) {
            // 집 > 건축물: 집 벽 드래그 설치 툴
            int atlasResId = getResources().getIdentifier("wooden_house_walls", "drawable", getPackageName());
            if (atlasResId == 0) atlasResId = R.drawable.wooden_house_walls;
            itemList.add(new Item("house_wall_tool", "건축물", 0, atlasResId, true));
        }
    }
```

(2)
그 추가한 바로 함수 아래에
```
private void addIfExists(String entryName, String category) {
        int resId = getResources().getIdentifier(entryName, "drawable", getPackageName());
        if (resId != 0) itemList.add(new Item(entryName, category, 0, resId, true));
    }
    private void addIfExistsAs(String name, String entry, String category) {
        int resId = getResources().getIdentifier(entry, "drawable", getPackageName());
        if (resId != 0) itemList.add(new Item(name, category, 0, resId, true));
    }
```
이 부분 붙여넣기





