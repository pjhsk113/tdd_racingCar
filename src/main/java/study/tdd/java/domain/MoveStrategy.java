package study.tdd.java.domain;

/**
 * 자동차의 전진 전략
 * Random값에 대한 테스트가 어려워 전략 패턴으로 수정
 */
public interface MoveStrategy {

    boolean moveAble();
}
