<변경 사항>
 
+) Tab4Activity & activity_tab4.xml는 그냥 모두 위 깃허브에 업로드된 코드로 복사 붙여넣기하면 돼요

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

15. 메인화면에 캐릭터 에셋 적용 (app/src/main/res/drawable에서 basic_spritesheet.png 추가)

16. 움직이는 애니메이션 추가 (SpriteView.java 파일 추가)

17. 인벤토리에 농장/울타리 아이템 추가 (app/src/main/res/drawable에서 tile000.png ~ tile031.png 추가)
