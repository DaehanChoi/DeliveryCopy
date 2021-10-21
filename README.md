##프로젝트 종료 후 정리 예정 ㅜㅜ


viewpager - tab 연결
> viewpager를 제작하고, tab 레이아웃을 제작함
> tab_layout.setupWithViewPager(viewPager)로 연결 끝
> 뷰페이저 어댑터의 getPageTitle을 통해 탭네임은 자동으로 지정됨 -> 개꿀!

## 뷰페이저 어댑터 작성 참고사항 
> 


## 리사이클러 뷰 사용시 참고사항
> 레이아웃에서 layoutmanager 설정하는 것 잊지 말것 


## okHttp
> 안드로이드 9버젼의 경우 https를 강제하고있음 이에 유의 + internet permission 설정을 이후에 했을 경우 app을 vm에서 삭제한후 다시 빌드하면  
> > CLEARTEXT communication to XXXX not permitted by network security policy 경고
> > 해결법 
> > ```
> > <application
> > ...
> > android:usesCleartextTraffic="true">
> > ```
