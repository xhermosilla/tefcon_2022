package main

import (
	"word-search-go/word-search-go/files"

	"github.com/gin-gonic/gin"
)

func main() {
	router := gin.Default()
	router.GET("/files/:fileName/searchWord", files.SearchWord)
	router.Run()
}
