(ns collector.routes.home
  (:require [collector.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [collector.db.core :as db]))

(defn home-page []
  (layout/render
    "home.html" 
    {:messages (db/get-messages)}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  ; (POST "/message" request (save-message! request))
  (GET "/about" [] (about-page)))

