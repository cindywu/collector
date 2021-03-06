(ns collector.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [collector.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[collector started successfully using the development profile]=-"))
   :middleware wrap-dev})
