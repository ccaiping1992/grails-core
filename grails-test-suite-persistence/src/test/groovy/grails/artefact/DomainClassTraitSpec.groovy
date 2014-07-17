package grails.artefact

import grails.persistence.Entity
import spock.lang.Specification

class DomainClassTraitSpec extends Specification {

    void 'test that a class marked with @Artifact("Domain") is enhanced with the DomainClass trait'() {
        expect:
        DomainClass.isAssignableFrom SomeDomainClass
    }
}


@Artefact('Domain')
class SomeDomainClass{}
