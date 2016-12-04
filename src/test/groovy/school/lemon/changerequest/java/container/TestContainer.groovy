package school.lemon.changerequest.java.container

import spock.lang.Specification
import spock.lang.Unroll

class TestContainer extends Specification {

    def container = new ContainerImpl();

    def "Add at the end"() {
        given:
        int[] elements = new int[Container.INITIAL_ARRAY_SIZE * 2];
        for (int i = 0; i < elements.length; ++i) {
            elements[i] = Math.random() * 1000;
        }

        when: "Element is added to container"
        for (int element : elements) {
            container.add element
        }

        then: "Size should be increased and you can get elements by index"
        container.size() == elements.length
        for (int i = 0; i < elements.length; ++i) {
            assert container.get(i) == elements[i]
        }
    }

    @Unroll
    def "Add by index #index"() {
        given:
        container.add 1
        container.add 3

        expect:
        container.add(element, index) == result
        container.size() == size
        for (int i = 0; i < remainElements.size(); ++i) {
            assert container.get(i) == remainElements.get(i)
        }

        where:
        element | index | result | size | remainElements
        0       | 0     | true   | 3    | [0, 1, 3]
        2       | 1     | true   | 3    | [1, 2, 3]
        4       | 2     | true   | 3    | [1, 3, 4]
        -1      | -1    | false  | 2    | [1, 3]
        3       | 3     | false  | 2    | [1, 3]
    }

    @Unroll
    def "Remove by index #index"() {
        given:
        container.add 1
        container.add 2
        container.add 3

        expect:
        container.remove(index) == result
        container.size() == size
        for (int i = 0; i < remainElements.size(); ++i) {
            assert container.get(i) == remainElements.get(i)
        }

        where:
        index | result | size | remainElements
        0     | true   | 2    | [2, 3]
        1     | true   | 2    | [1, 3]
        2     | true   | 2    | [1, 2]
        -1    | false  | 3    | [1, 2, 3]
        3     | false  | 3    | [1, 2, 3]
    }

    @Unroll
    def "Clear"() {
        given:
        container.add 1
        container.add 2
        container.add 3

        when:
        container.clear()

        then:
        container.size() == 0
        container.get(0) == null
        !container.remove(0)
    }

}
