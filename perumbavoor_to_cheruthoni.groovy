    
    g.addV('Perumbavoor').property('place','Perumbavoor').property('place_level1','Perumbavoor').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Kothamangalam').property('place','Kothamangalam').property('place_level2','Kothamangalam').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Neriyamangalam').property('place','Neriyamangalam').property('place_level2','Neriyamangalam').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Cheruthoni').property('place','Cheruthoni').property('place_level3','Cheruthoni').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Kattappana').property('place','Kattappana').property('place_level4','Kattappana').property('count',0).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Moovattupuzha').property('place','Moovattupuzha').property('place_level2','Moovattupuzha').property('count',3).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Thodupuzha').property('place','Thodupuzha').property('place_level2','Thodupuzha').property('count',5).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Vannappuram').property('place','Vannappuram').property('place_level2','Vannappuram').property('count',5).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Moolamattam').property('place','Moolamattam').property('place_level2','Moolamattam').property('count',8).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('Wagamon').property('place','Wagamon').property('place_level3','Wagamon').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()



    g.V().has('Kothamangalam','place_level2','Kothamangalam').addE('way').property('distance',3).to(__.V().has('Perumbavoor','place', 'Perumbavoor').has('place_level1', 'Perumbavoor')).next()
    g.V().has('Neriyamangalam','place_level2','Neriyamangalam').addE('way').property('distance',3).to(__.V().has('Kothamangalam','place', 'Kothamangalam').has('place_level2', 'Kothamangalam')).next()
    g.V().has('Cheruthoni','place_level3','Cheruthoni').addE('way').property('distance',3).to(__.V().has('Neriyamangalam','place', 'Neriyamangalam').has('place_level2', 'Neriyamangalam')).next()
    g.V().has('Kattappana','place_level4','Kattappana').addE('way').property('distance',3).to(__.V().has('Cheruthoni','place', 'Cheruthoni').has('place_level3', 'Cheruthoni')).next()
    g.V().has('Moovattupuzha','place_level2','Moovattupuzha').addE('way1').property('distance',3).to(__.V().has('Perumbavoor','place', 'Perumbavoor').has('place_level1', 'Perumbavoor')).next()
    g.V().has('Thodupuzha','place_level2','Thodupuzha').addE('way1').property('distance',3).to(__.V().has('Moovattupuzha','place', 'Moovattupuzha').has('place_level2', 'Moovattupuzha')).next()
    g.V().has('Cheruthoni','place_level3','Cheruthoni').addE('way1').property('distance',3).to(__.V().has('Thodupuzha','place', 'Thodupuzha').has('place_level2', 'Thodupuzha')).next()
    g.V().has('Kattappana','place_level4','Kattappana').addE('way1').property('distance',3).to(__.V().has('Cheruthoni','place', 'Cheruthoni').has('place_level3', 'Cheruthoni')).next()
    g.V().has('Moovattupuzha','place_level2','Moovattupuzha').addE('way2').property('distance',3).to(__.V().has('Perumbavoor','place', 'Perumbavoor').has('place_level1', 'Perumbavoor')).next()
    g.V().has('Thodupuzha','place_level2','Thodupuzha').addE('way2').property('distance',3).to(__.V().has('Moovattupuzha','place', 'Moovattupuzha').has('place_level2', 'Moovattupuzha')).next()
    g.V().has('Vannappuram','place_level2','Vannappuram').addE('way2').property('distance',3).to(__.V().has('Thodupuzha','place', 'Thodupuzha').has('place_level2', 'Thodupuzha')).next()
    g.V().has('Cheruthoni','place_level3','Cheruthoni').addE('way2').property('distance',3).to(__.V().has('Vannappuram','place', 'Vannappuram').has('place_level2', 'Vannappuram')).next()
    g.V().has('Kattappana','place_level4','Kattappana').addE('way2').property('distance',3).to(__.V().has('Cheruthoni','place', 'Cheruthoni').has('place_level3', 'Cheruthoni')).next()
    g.V().has('Moovattupuzha','place_level2','Moovattupuzha').addE('way3').property('distance',3).to(__.V().has('Perumbavoor','place', 'Perumbavoor').has('place_level1', 'Perumbavoor')).next()
    g.V().has('Thodupuzha','place_level2','Thodupuzha').addE('way3').property('distance',3).to(__.V().has('Moovattupuzha','place', 'Moovattupuzha').has('place_level2', 'Moovattupuzha')).next()
    g.V().has('Moolamattam','place_level2','Moolamattam').addE('way3').property('distance',3).to(__.V().has('Thodupuzha','place', 'Thodupuzha').has('place_level2', 'Thodupuzha')).next()
    g.V().has('Wagamon','place_level3','Wagamon').addE('way3').property('distance',3).to(__.V().has('Moolamattam','place', 'Moolamattam').has('place_level2', 'Moolamattam')).next()
    g.V().has('Kattappana','place_level4','Kattappana').addE('way3').property('distance',3).to(__.V().has('Wagamon','place', 'Wagamon').has('place_level3', 'Wagamon')).next()

    g.addV('bus').property('count',3).property('created_at',new Date()).property('updated_at',new Date()).next()
