(defproject j4c "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Boost Software License - Version 1.0"
            :url "https://www.boost.org/users/license.html"}
  :repositories [["jitpack" "https://jitpack.io"]]
  ; :resource-paths ["resources/clust4j-1.2.5.jar"]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.logging "0.5.0"]
                 [com.github.r6eve/clust4j "1.2.5"]
                 [org.apache.commons/commons-math3 "3.6.1"]]
  :repl-options {:init-ns j4c.core})
