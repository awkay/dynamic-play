(defproject trial "1.0.0-beta8-SNAPSHOT"
  :description "A library for building full-stack SPA webapps in Clojure and Clojurescript"
  :url ""
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0" ]
                 [org.clojure/clojurescript "1.9.894" ]
                 [fulcrologic/fulcro "1.0.0-beta8-SNAPSHOT"]]

  :source-paths ["src"]
  :clean-targets ^{:protect false} ["resources/private/js" "resources/public/js" "target"]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :cljsbuild {:builds
              [ {:id           "demos"
                :source-paths ["src"]
                :compiler     {:output-dir    "resources/public/js/demos"
                               :asset-path    "js/demos"
                               :modules       {:entry-point {:output-to "resources/public/js/demos/demos.js"
                                                             :entries   #{recipes.dynamic-ui-routing}}
                                               :main        {:output-to "resources/public/js/demos/main-ui.js"
                                                             :entries   #{recipes.dynamic-ui-main}}}
                               :verbose       true
                               :optimizations :advanced}}
               ]})
