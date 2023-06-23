package hello.spring.basic;

import hello.spring.bean.*;

public class Spring5App04 {

    // 다섯번째 사례
    // 인삿말을 한국어,영어,일본어로 출력하도록 기능 추가

    // 문자열을 통해 생성해야 할 객체를 취사선택하게 됨
    // 개발자가 신경써야 할 부분이 늘어났다는 단점 발생
    // 즉, 비지니스 코드 작성하는 것도 버거운데
    // 객체 생성관련 클래스를 따로 작성하는 것은 더욱 힘듦

    // 해결 : 객체 생성부분은 외부의 힘을 빌림
    // 즉, 스프링의 IoC 컨테이너가 객체를 생성해주고
    // 그것을 주입받음

    public static void main(String[] args) {
        Spring5Bean03 app04 = null;

        app04 = Spring5Bean04Factory.create("kor");
        app04.sayHello("스프링5!!");

        app04 = Spring5Bean04Factory.create("eng");
        app04.sayHello("Spring5!!");

        app04 = Spring5Bean04Factory.create("jpn");
        app04.sayHello("スプリング 5!!");
    }

}
