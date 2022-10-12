job("Build") {
    container("texlive/texlive") {
        env["BUILD_COUNT_SERVER"] = Secrets("build_count_server")
        shellScript("Build") {
            location = "./build.sh"
        }
    }
}
