# fabric-paper-mod-manager

fabric-paper-mod-manager는 Fabric/Paper 혼합 런타임에서 모드/플러그인 관리를 돕는 도구입니다.

이 문서는 GitHub 기본 브랜치의 메타데이터와 서버 운영 맥락을 기준으로 작성된 한국어 README입니다.

## 저장소 요약

| 항목 | 값 |
| --- | --- |
| GitHub | `Team-MS-2/fabric-paper-mod-manager` |
| 기본 브랜치 | `main` |
| 유형 | Java/Gradle 프로젝트 |

## 주요 기능

- Fabric/Paper 혼합 런타임에서 모드성 jar와 Paper plugin 배치를 보조합니다.
- 서버 시작 시 필요한 mod/plugin 상태를 관리하는 경량 도구 역할을 합니다.
- Canvas/Horizon 계열 마이그레이션에서 런타임 자산 관리를 단순화합니다.

## 저장소 구조

- `buildSrc/`
- `gradle/`
- `run/`
- `runServerTask/`
- `src/`

## 빌드

Gradle wrapper가 있는 저장소는 wrapper를 우선 사용합니다.

```powershell
.\gradlew.bat build
```

## 배포 메모

- 변경 범위를 소유 subsystem 안으로 유지하고, 필요한 downstream publish 또는 서버 재시작 절차를 커밋/PR에 남깁니다.

## 유지보수 체크리스트

- 기본 브랜치가 실제 운영/마이그레이션 브랜치와 다른지 먼저 확인합니다.
- 코드 변경 후에는 가장 좁은 유효 빌드 또는 테스트 명령을 실행합니다.
- 모듈명, 런타임 의존성, 배포 파일명이 바뀌면 이 README도 함께 갱신합니다.
