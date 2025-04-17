# 

### Spring Cloud?

- MSA 관리를 용이하게 해주는 스프링 기반 도구 모음
- 주요모듈
    - Spring Cloud Gateway : 요청서비스 라우티해주는 입구 역할
    - Eureka : 서비스 위치 자동 등록/탐색 (IP말고 이름으로 서치)
    - Config Server : 모든 서비스의 설정파일을 중앙관리
    - Feign : 서비스간 통신을 HTTP + 인터페이스 형식으로 간편하게
    - Circuit Breaker : 장애 발생시 우회 /차단 처리
    - Bus / Stream : 메시지 기반의 통신

### Spring Cloud Gateway ?

- MSA 구조에서 클라이언트의 모든 요청을 처음 받는 관문 서버
- Spring 기반 프록시 서버
    - 라우팅 : URL 패턴에 따라 적합한 서비스로 요청 전달
    - 인증/보안 : 로그인 토큰 확인, 인증체크
    - 로깅/모니터링 : 요청 정보 기록, 통계 수집
    - 필터처리 : 공통 로직 삽입
    - 속도제한/리미터 : 과도한 트래픽 제어

### ✅ 구현 내용

- 3개의 마이크로 서비스 기반 SCG, Eureka, Config Server 구현
- Global , Local 구분하여 Filter 구현
