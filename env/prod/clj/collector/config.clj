(ns collector.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[collector started successfully]=-"))
   :middleware identity})
