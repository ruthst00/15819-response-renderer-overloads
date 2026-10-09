package com.example

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class SearchControllerSpec extends Specification implements ControllerUnitTest<SearchController> {

    void 'AJAX results renders the model as an HTML fragment without a layout'() {
        given:
        request.method = 'GET'
        request.addHeader('X-Requested-With', 'XMLHttpRequest')

        when:
        controller.results()

        then:
        response.status == 200
        response.contentType.startsWith('text/html')
        response.text.replaceAll(/\s+/, ' ').trim() ==
                '<ul id="results"> <li>Grails</li> <li>Groovy</li> <li>Spring Boot</li> </ul>'
    }

    void 'results rejects POST requests'() {
        given:
        request.method = 'POST'
        request.addHeader('X-Requested-With', 'XMLHttpRequest')

        when:
        controller.results()

        then:
        response.status == 405
    }
}