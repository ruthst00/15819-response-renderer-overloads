package com.example

class SearchController {

    static allowedMethods = [results: 'GET']

    /**
     * Returns an HTML fragment for AJAX callers, without a GSP layout.
     */
    def results() {
        // Grails prefixes template names with "_", so this resolves to __results.gsp.
        render(template: '_results', model: [results: ['Grails', 'Groovy', 'Spring Boot']])
    }
}