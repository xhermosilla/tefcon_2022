const { searchWord } = require('./views');

/**
 * Files routes.
 *
 * @param {FastifyInstance} fastify Fastify Instance
 */
async function routes(fastify) {
  /**
   * Search word from file.
   */
  fastify.get('/files/:fileName/searchWord', searchWord);
}

module.exports = { routes };
