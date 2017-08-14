(require '[cljs.build.api :as b])

(b/build "src"
  {:output-dir    "resources/public/js/demos"
   :asset-path    "js/demos"
   :modules       {:entry-point {:output-to "resources/public/js/demos/demos.js"
                                 :entries   '#{recipes.dynamic-ui-routing}}
                   :main        {:output-to "resources/public/js/demos/main-ui.js"
                                 :entries   '#{recipes.dynamic-ui-main}}}
   :verbose       true
   :optimizations :none})

