package hello.spring.basic;

import hello.spring.bean.Spring5Bean01;

public class Spring5App01 {
    // 두번째 사례
    // sayHello메서드를 외부 클래스로 옮기고
    // 인삿말을 출력하는 기능을 구현했음
    // 즉, 인삿말을 출력하려면 외부 클래스를
    // 객체화한 뒤 sayHello 메서드를 호출해야 함

    // 여기서 보듯, Spring5App01을 실행하려면
    // 반드시 Spring5Bean01이라는 클래스가 필수임
    // 즉, 클래스간의 의존성이 커짐

    // 의존성이 커짐으로 인해 발생하는 부수적인 단점은
    // 코드변경시 그것과 연관되는 다른 클래스에 영향을 미침
    // 따라서, 유지보수의 범위가 넓어짐
    // 해결 : 인터페이스를 도입해서 객체간의 의존성을 낮춰줌

    public static void main(String[] args) {
        // 호출할클래스명 변수명 = new 호출할클래스명();
        Spring5Bean01 app01 = new Spring5Bean01();

        // 메서드 호출 : 변수명.메서드명
        app01.sayHello("스프링5!!");
    }

}
