(ns atracker.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [atracker.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[atracker started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[atracker has shut down successfully]=-"))
   :middleware wrap-dev})
