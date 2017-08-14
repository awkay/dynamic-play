(require '[cljs.build.api :as b])

(b/build "src"
  {:output-dir    "resources/public/js/demos"
   :asset-path    "js/demos"
   :modules       {:entry-point {:output-to "resources/public/js/demos/demos.js"
                                 :entries   '#{app.main}}
                   :mod        {:output-to "resources/public/js/demos/main-ui.js"
                                 :entries   '#{app.mod}}}
   :verbose       true
   :optimizations :advanced})

