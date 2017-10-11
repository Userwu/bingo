const webpack = require('webpack')
const ExtractTextPlugin = require('extract-text-webpack-plugin')
const path = require('path')
const sourcePath = path.join(__dirname, './static/src')
const outputPath = path.join(__dirname, './../output/dist/')

module.exports = {
  entry:{
    'admin' : './static/src/pages/admin.js',
    'work' : './static/src/pages/work.js',
    'index' : './static/src/pages/index.js',
    'error' : './static/src/pages/error.js',
  },
  // 出口文件
  output: {
    path: outputPath,
    publicPath: '/static/output/dist/',
    filename: 'js/[name].js',
  },
}