package files

import (
	"net/http"
	"os"
	"path/filepath"
	"regexp"

	"github.com/gin-gonic/gin"
)

const FILES_PATH = "../../assets/files"

func SearchWord(c *gin.Context) {
	fileName := c.Param("fileName")
	word := c.Query("word")
	count := 0

	text, _ := os.ReadFile(filepath.Join(FILES_PATH, fileName))
	words := regexp.MustCompile(`[\s,.:;]+`).Split(string(text), -1)

	for _, s := range words {
		if s == word {
			count++
		}
	}

	c.JSON(http.StatusOK, gin.H{
		"file":  fileName,
		"word":  word,
		"count": count,
	})
}
