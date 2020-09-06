(ns j4c.clust4j
  (:require [clojure.tools.logging :as log])
  (:import [com.clust4j.algo MeanShiftParameters]
           [org.apache.commons.math3.linear Array2DRowRealMatrix]))

#_(
(def mat
  (-> [(double-array [0.005 0.182751 0.1284])
       (double-array [3.65816 0.29518 2.123316])
       (double-array [4.1234 0.2301 1.8900002])]
      into-array
      Array2DRowRealMatrix.))

(let [ms (.fitNewModel (MeanShiftParameters. 0.5) mat)]
  (vec (.getLabels ms))) ; [0 1 2]

(log/info "hello")
; log4j:WARN No appenders could be found for logger (j4c.clust4j).
; log4j:WARN Please initialize the log4j system properly.
; log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
)
