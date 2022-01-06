module.exports = {
    outputDir: 'target/dist',
    devServer:{
        host:'localhost',
        port:8080,
        https:true,
        proxy:'https://localhost:8005',
        disableHostCheck:true
    }
}