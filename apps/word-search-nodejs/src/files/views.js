const fs = require('fs/promises');
const path = require('path');

const FILES_PATH = path.join(process.cwd(), '../../assets/files');

module.exports = {
  /**
   * Search for words in file.
   *
   * @param {object} request Fastify request
   * @returns {object} Result
   */
  async searchWords(request) {
    const { fileName } = request.params;
    const { word } = request.query || '';
    const text = (await fs.readFile(path.join(FILES_PATH, fileName))).toString('utf-8');

    const count = text.split(/[\s,.:;]+/).filter((w) => w.trim() === word).length;

    return { file: fileName, searchWord: word, count };
  },
};
