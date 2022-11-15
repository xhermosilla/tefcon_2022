const { searchWords } = require('./views');

/**
 * Files routes.
 *
 * @param {FastifyInstance} fastify Fastify Instance
 */
async function routes(fastify) {
  /**
   * Search word from file.
   */
  fastify.get('/files/:fileName/search/words', searchWords);
}

module.exports = { routes };
