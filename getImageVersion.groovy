def call(String branch, String baseVersion) {
    if (branch.equals("master")) {
        return "${baseVersion}"
    } else {
        return "${baseVersion}-${branch}".toLowerCase().replaceAll(/[-_ ]+/,"-");
    }
}
