# :house: ZIP(집)

- 사랑하는 가족과 매일 주어지는 미션을 통해 소통하고, 메타버스를 결합해 소통을 즐겁게 만드는 

  **게이미피케이션 + 메타버스 결합 가족 소통 어플리케이션**

- 📜 [노션](https://www.notion.so/ZIP-846def57bc31437ea8e608ad5745990d)

<br/>
<br/>


## ZIP - 배경 

---

<img src="docs/img/zip_logo.png" width="200" height="200"/>

<br/>
<br/>

여러분들에게 **가족**이란 어떤 존재인가요? 서로 소중하다고 생각은 하지만, 부모 간, 부모-자식 간 소통에 어려움이 있진 않으시는가요?

통상적으로 가족 간 갈등의 주원인은 소통 문제(57%, 복수 선택)로 나타나고, 가족간 대화가 어려운 이유는 마주할 시간이 없어서(32%), 공감대 형성이 어려워서(28%) 순으로 나타나고 있습니다.

ZIP은 매일 주어지는 미션(백문백답, 오늘의 편지)을 활용해 재미있게 참여하고, 보상으로 가족 메타버스 공간을 꾸미며 가족 간 소통을 원활하게 만들어 주는 애플리케이션입니다!

<br/>

## 프로젝트 진행 기간

---

2022.10.10(월) ~ 2022.11.18(금) 약 39일간 진행<br/>
SSAFY 7기 2학기 자율프로젝트 - ZIP

<br/>
<br/>

## :heart: 주요 기능 

---

- ### 재미

  - :grey_question:  **오늘의 백문백답** 
    - 가족 구성원이 뭘 좋아하고, 어떻게 생각하고 있는지에 대해 알 수 있는 백문백답! 매일 답해야 하는 질문이 바뀌고, 대답하며 서로의 생각을 나눠봐요! 가족 전원 참여시 대량의 포인트를!

  - **:e-mail:  오늘의 편지** 
    - 가족 간에 평소 하고 싶은 말을 글로 적어 소통해보세요! 매일 편지를 써야 하는 상대가 바뀝니다! 부끄러워 전하지 못한 칭찬, 얼굴을 마주 보고 말하기 어려운 서운한 점 등 자유롭게 글로 이야기해봐요! 가족 전원 작성시 대량의 포인트를!
  - :earth_asia:  **메타버스**
    - 매일 참여한 미션들로 쌓인 포인트로 가족만의 공간을 메타버스에서 꾸며봐요! 일일 미션을 진행하며 쌓인 포인트로 가구를 사서 방을 꾸미고, 액자에 사진을 장식해봐요!
    - 가족이 가상 공간에 모여 대화할 수 있는 음성 채팅 기능! 직접 만나기 어려운 상황에 메타버스 공간에서 소통해요!

<br/>

- ### 소통

  - :page_with_curl:  **게시판**

    - 자유롭게 글을 올릴 수 있는 게시판! 사진 업로드가 가능하며 사랑하는 가족에게 먹은 음식을 자랑하는 등 자유롭게 작성해봐요!
    - 댓글을 통해 소통할 수 있습니다!
  
    <br/>
  
  - :book: **백문백답 & 오늘의 편지**
  
    - 가족 구성원들이 함께 진행했던 오늘의 편지, 오늘의 백문백답을 모아볼 수 있습니다! 특정 주제에 대해 어떻게 생각했는지 미션들을 보며 과거를 추억해봐요!
      


- ### 공유

  - :camera:  **공유 앨범**
    - 가족 간의 특별한 추억을 공유 앨범을 통해 보관하고 추억해봐요! 각 테마에 맞게 앨범을 만들 수 있으며 가족 구성원 모두 사진을 자유롭게 올릴 수 있습니다!
  - :calendar:  **공유 캘린더**
    - 가족의 일정을 공유할 수 있는 캘린더! 구성원들과 함께하는 일정, 혹은 개인 약속을 등록해봐요!
    - 갑자기 생긴 약속이나 일정을 등록하면 가족 간 오해를 줄일 수 있겠죠?



- ### 알림

  - 가족들이 참여한 모든 행동은 푸쉬 알림을 통해 확인할 수 있습니다!
  - 알림을 통해 일정을 확인하고, 미션 진행 상황을 공유하고, 서로의 소식을 빠르게 확인할 수 있습니다!



## :heavy_check_mark: 주요 기술 

---

**Backend - Spring**

- IntelliJ IDEA : 2021.3.1
- IntelliJ Runtime:      11.0.13+7-b1751.21 amd64
- JDK : 17-ea
- JRE : build 17-ea+14
- JVM : build 17-ea+14, mixed      mode, sharing
- DB : 8.0.30-MySQL
- Springboot : 2.7.3
- Gradle : 7.5

- 

**Frontend  - Android Studio(kotlin)**

- Android Studio Dolphin | 2021.3.1 Patch 1
- ART :      11.0.13+0-b1751.21-8125866 amd64
- VM: OpenJDK 64-Bit Server 
- SDK version : (min : 26,      target : 32)



**Unity :**

- 2021.3.9.f1



**CI/CD**

- Server : AWS EC2 Ubuntu      20.04 LTS
- Docker : 20.10.20
- nginx : 1.18.0
- Jenkins : 2.346.2



<br/>

## :heavy_check_mark: 협업 툴 / 환경

---

- GitLab
  - Git-Flow. develop, FE_develop, BE_develop 브랜치를 나누고
  - 각 feature별 브랜치를 따서 작업 진행
  - MR시 Front/Back Maintainer가 확인 후 합병
- Notion
  - 회의가 있을때마다 회의록을 기록하여 보관
  - 컨벤션 정리
  - api 문서 관리 등
- JIRA
  - 매주 월요일 목표량을 설정하여 Sprint 진행
  - 업무별 Story Point(1~4)를 설정, In-Progress -> Done 순으로 작업  
- MatterMost
  - Gitlab, JIRA 봇 연동하여 실시간으로 협업
  - Server 연동하여 실시간 에러 처리
- Webex
  - 회의 : 평일 아침 Webex에서 데일리 스크럼 진행
  - 문제점이 생겼을 때 팀원들에게 직접 소통


<br/>

## :heavy_check_mark: 팀원 역할 분배

---

- 이승연(Frontend / UNITY / 팀장)
- 이도엽(Frontend maintainer / UNITY )
- 이보나(Frontend / UCC maintainer)
- 김민균(Frontend / Jira maintainer)
- 이재순(Backend / Backend maintainer  )
- 류현수(Backend / BE developer)

<br/>

## :heavy_check_mark: 프로젝트 산출물

---

- [기능명세서](docs/기능명세서.xlsx)
- [와이어프레임 & 스토리보드](docs/와이어프레임.png)
- [프로젝트계획서](docs/프로젝트계획서.pdf)
- [컨벤션&git](doc/컨벤션&Git.md)
- [API명세서](docs/API명세서.xlsx)
- [ERD](docs/ERD.png)
- [테스트케이스](docs/테스트케이스.xlsx)

## :heavy_check_mark: 프로젝트 결과물

---

- [중간발표자료](docs/중간발표자료.pptx)
- [최종발표자료](docs/최종발표자료.pptx)
  <br/>

## :heavy_check_mark: 폴더 구조 - Frontend

```
app
│  └─src
│      ├─androidTest
│      │  └─java
│      │      └─com
│      │          └─ssafy
│      │              └─zip
│      │                  └─android
│      ├─debug
│      │  └─res
│      │      ├─drawable
│      │      ├─drawable-hdpi
│      │      ├─drawable-mdpi
│      │      ├─drawable-xhdpi
│      │      └─drawable-xxhdpi
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─ssafy
│      │  │          └─zip
│      │  │              └─android
│      │  │                  ├─adapter
│      │  │                  ├─data
│      │  │                  │  ├─request
│      │  │                  │  └─response
│      │  │                  ├─repository
│      │  │                  └─viewmodel
│      │  └─res
│      │      ├─drawable
│      │      ├─drawable-v24
│      │      ├─font
│      │      ├─layout
│      │      ├─menu
│      │      ├─mipmap-hdpi
│      │      ├─mipmap-mdpi
│      │      ├─mipmap-xhdpi
│      │      ├─mipmap-xxhdpi
│      │      ├─mipmap-xxxhdpi
│      │      ├─navigation
│      │      ├─values
│      │      ├─values-night
│      │      └─xml
│      └─test
│          └─java
│              └─com
│                  └─ssafy
│                      └─zip
│                          └─android
└─gradle
    └─wrapper
```

<br/>

## :heavy_check_mark: 폴더 구조 - Backend

```
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─ssafy
    │  │          └─zip
    │  │              ├─config
    │  │              │  └─security
    │  │              ├─controller
    │  │              ├─dto
    │  │              │  ├─request
    │  │              │  └─response
    │  │              ├─entity
    │  │              ├─exception
    │  │              ├─repository
    │  │              ├─service
    │  │              └─util
    │  └─resources
    └─test
        └─java
            └─com
                └─ssafy
                    └─zip
```

<br/>

## :heavy_check_mark: 폴더 구조 - Unity

```
├── Assets
│   ├── Adaptive Performance
│   ├── Adaptive Performance.meta
│   ├── Animation
│   ├── Animation.meta
│   ├── Editor
│   ├── Editor.meta
│   ├── Exoa
│   ├── Exoa.meta
│   ├── Fonts
│   ├── Fonts.meta
│   ├── Furniture_1
│   ├── Furniture_1.meta
│   ├── Images
│   ├── Images.meta
│   ├── NINESOFT_ASSETS
│   ├── NINESOFT_ASSETS.meta
│   ├── Photon
│   ├── Photon.meta
│   ├── Plugins
│   ├── Plugins.meta
│   ├── Readme.asset
│   ├── Readme.asset.meta
│   ├── Resources
│   ├── Resources.meta
│   ├── Scenes
│   ├── Scenes.meta
│   ├── Scripts
│   ├── Scripts.meta
│   ├── TextMesh Pro
│   ├── TextMesh Pro.meta
│   ├── TutorialInfo
│   ├── TutorialInfo.meta
│   ├── UJoystick
│   ├── UJoystick.meta
│   ├── _Heathen Engineering
│   ├── _Heathen Engineering.meta
│   ├── characters_5_02
│   └── characters_5_02.meta
├── Packages
│   ├── manifest.json
│   └── packages-lock.json
├── ProjectSettings
│   ├── AudioManager.asset
│   ├── BurstAotSettings_Android.json
│   ├── BurstAotSettings_StandaloneWindows.json
│   ├── ClusterInputManager.asset
│   ├── CommonBurstAotSettings.json
│   ├── DynamicsManager.asset
│   ├── EditorBuildSettings.asset
│   ├── EditorSettings.asset
│   ├── GraphicsSettings.asset
│   ├── InputManager.asset
│   ├── MemorySettings.asset
│   ├── NavMeshAreas.asset
│   ├── NotificationsSettings.asset
│   ├── PackageManagerSettings.asset
│   ├── Packages
│   ├── Physics2DSettings.asset
│   ├── PresetManager.asset
│   ├── ProjectSettings.asset
│   ├── ProjectVersion.txt
│   ├── QualitySettings.asset
│   ├── SceneTemplateSettings.json
│   ├── TagManager.asset
│   ├── TimeManager.asset
│   ├── TimelineSettings.asset
│   ├── UnityConnectSettings.asset
│   ├── VFXManager.asset
│   ├── VersionControlSettings.asset
│   ├── XRSettings.asset
│   └── boot.config
├── androidBuild
│   ├── build.gradle
│   ├── gradle
│   ├── gradle.properties
│   ├── launcher
│   ├── local.properties
│   ├── settings.gradle
│   └── unityLibrary
└── androidBuild_BurstDebugInformation_DoNotShip
    └── tempburstlibs

```

<br/>

## :heavy_check_mark: CI/CD

```
Ubuntu
└─Docker
   ├─zip-back : 0.0.0.0:8888 -> 8888/tcp
   ├─redis-container : 0.0.0.0:8379 -> 6379/tcp
   └─mysql-container : 0.0.0.0:3306 -> 3306/tcp
```

<br/>



## :heavy_check_mark: 페이지 기능 소개 

- 홈

  <img src="/uploads/842892cb3d1d253e070e4af7e4f19156/1.홈.gif" width='220' height="450" />

  

- 홈 - 미션

  <img src="/uploads/738f2f3e114a746dbe7055adfe2ea5b1/2.홈_미션.gif" width='220' height="450" />

- 기록 탭 - 앨범

  <img src="/uploads/db6c30fdc0e3ba1a56a5111e1b9f1f84/3.앨범.gif" width='220' height="450" />

- 기록 탭 - 게시판 전체

  <img src="/uploads/c5a04e554b5e7c656db8845f1c06d575/4.게시판_전체.gif" width='220' height="450" />

- 기록 탭 - 게시판 상세

  <img src="/uploads/c73397c7a9d1c3f002977e841f229a4f/5.게시글_상세.gif" width='220' height="450" />

- 기록 탭 - 백문백답 상세

  <img src="/uploads/161230a6a3b096470b1044296a3c4d59/6.백문백답_상세.gif" width='220' height="450" />

- 기록 탭 - 오늘의 편지 상세

  <img src="/uploads/7b86835da3f7f2fcd6223a514ac41dfd/7.오늘의_편지_상세.gif" width='220' height="450" />

- 일정 탭 - 일정 확인 및 등록

  <img src="/uploads/116d380e4173797953d7c40373b5aaa3/8.일정.gif" width='220' height="450" />

- 푸시 알림

  <img src="/uploads/ea38ae6a22601f8ed09e4809dc885818/9.푸시알림.gif" width='220' height="450" />

- 알림 탭

  <img src="/uploads/9dd482e47d093d86376a3ceb43764f57/10.알림페이지.gif" width='220' height="450" />

- 메타버스 - 입장(로딩)

  <img src="/uploads/9eb92c1bdfc1af08d6da3fc26534eb9b/11.로딩.gif" width='600' height="300" />

- 메타버스 - 사진

- <img src="/uploads/216d98d5503905225ffec5e7dcf8925a/12.사진.gif" width='600' height="300" />

- 메타버스 - 가구배치

  <img src="/uploads/374bdabc6e7242f6765f175293c59494/13.가구배치.gif" width='600' height="300" />

- 메타버스 - 음성채팅

  <img src="/uploads/08fb5134febc1520eed35bb690a818e3/14.메타버스-음성채팅.gif" width='600' height="300" />
