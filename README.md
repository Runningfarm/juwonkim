<변경 사항>

1. activity_main.xml의 15~16번째 줄 아래 내용으로 변경

```
android:layout_width="60dp"
android:layout_height="60dp“
```
+) 190~197번째 줄 삭제


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

5. activity_tab2.xml의 259~266번째 줄 삭제

6. activity_tab3.xml의 435~442번째 줄 삭제

7. activity_tab4.xml의 69~76번째 줄 삭제

8. activity_tab6.xml의 115~122번째 줄 삭제

9. MainActivity의 83번째 줄 삭제

10. Tab2Activity의 150~151번째 줄 삭제

11. Tab3Activity의 71번째 줄 삭제

12. Tab4Activity의 42번째 줄, 49번째 줄 삭제 

13. Tab6Activity의 34번째 줄, 58~59번째 줄 삭제

14. AndroidManifest.xml의 42번째 줄 삭제

15. 메인화면에 캐릭터 에셋 적용 (app/src/main/res/drawable에서 basic_spritesheet.png 추가)

16. 움직이는 애니메이션 추가 (SpriteView.java 파일 추가)

17. 인벤토리에 농장/울타리 아이템 추가 (app/src/main/res/drawable에서 tile000.png ~ tile031.png 추가)
   
+) Tab4Activity & activity_tab4.xml는 모두 위 깃허브에 업로드된 코드로 복사 붙여넣기
