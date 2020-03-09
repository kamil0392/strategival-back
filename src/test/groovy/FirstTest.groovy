import spock.lang.Specification

class FirstTest extends Specification {

    def "1 + 2 should equals 3"() {
        expect:
        1 + 2 == 3
    }
}
