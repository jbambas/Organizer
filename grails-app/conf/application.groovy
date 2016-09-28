

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'cvut.fel.bambaja2.organize.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'cvut.fel.bambaja2.organize.UserRole'
grails.plugin.springsecurity.authority.className = 'cvut.fel.bambaja2.organize.Role'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
    [pattern: '/unauthorized/**',access: ['permitAll']],
    [pattern: '/traineruser/**', access: ['ROLE_TRAINER', 'ROLE_ADMIN']],
    [pattern: '/loggeduser/**',  access: 'isAuthenticated()'],
    [pattern: '/adminuser/**',   access: ['ROLE_ADMIN']],

	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

