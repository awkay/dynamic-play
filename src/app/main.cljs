(ns app.main
  (:require [cljs.loader :as loader]
            [app.L :as l]
            [goog.dom :as gdom]))

; entry point
(.appendChild
  (gdom/getElement "app")
  (gdom/createDom "button" #js {:onclick (fn [e]
                                           (l/do-thing))} "Click to trigger load through library."))


(loader/set-loaded! :entry-point)
