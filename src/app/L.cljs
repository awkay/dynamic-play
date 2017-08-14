(ns app.L
  (:require [cljs.loader :as loader]))

; pretending to be a lib that derives the module to load from data...just hand-coded for now

(defn cb []
  (js/console.log "CALLBACK CALLED"))

(defn do-thing []
  (loader/load :mod cb))
