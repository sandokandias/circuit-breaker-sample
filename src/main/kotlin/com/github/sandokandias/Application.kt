package com.github.sandokandias

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.sandokandias")
		.start()
}

