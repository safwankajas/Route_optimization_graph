    //level1
    g.addV('place_main').property('place','cheruthoni').property('place_level1','cheruthoni').property('count',7).property('created_at',new Date()).property('updated_at',new Date()).next()
    //level1
    //level2
    g.addV('way1').property('place','way1').property('place_level2','way1').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('way2').property('place','way2').property('place_level2','way2').property('count',6).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('way3').property('place','way3').property('place_level2','way3').property('count',5).property('created_at',new Date()).property('updated_at',new Date()).next()
    //level2
    //level3
    g.addV('clg').property('place','clg').property('place_level3','clg').property('count',0).property('created_at',new Date()).property('updated_at',new Date()).next()
    //level3

    //level2 to level1
    g.V().has('way1','place_level2','way1').addE('way').property('distance',3).to(__.V().has('place_main','place', 'cheruthoni').has('place_level1', 'cheruthoni')).next()
    g.V().has('way2','place_level2','way2').addE('way').property('distance',4).to(__.V().has('place_main','place', 'cheruthoni').has('place_level1', 'cheruthoni')).next()
    g.V().has('way3','place_level2','way3').addE('way').property('distance',5).to(__.V().has('place_main','place', 'cheruthoni').has('place_level1', 'cheruthoni')).next()

    //level3 to level2
    g.V().has('clg','place_level3','clg').addE('way').property('distance',2).to(__.V().has('way1','place_level2','way1').has('place', 'way1')).next()
    g.V().has('clg','place_level3','clg').addE('way').property('distance',6).to(__.V().has('way2','place_level2','way2').has('place', 'way2')).next()
    g.V().has('clg','place_level3','clg').addE('way').property('distance',7).to(__.V().has('way3','place_level2','way3').has('place', 'way3')).next()


//level1
    g.addV('perumbavoor').property('place','perumbavoor').property('place_level1','perumbavoor').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('kothamangalam').property('place','kothamangalam').property('place_level2','kothamangalam').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('kothamangalam','place_level2','kothamangalam').addE('way').property('distance',3).to(__.V().has('perumbavoor','place', 'perumbavoor').has('place_level1', 'perumbavoor')).next()
    g.addV('neriyamangalam').property('place','neriyamangalam').property('place_level2','neriyamangalam').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('neriyamangalam','place_level2','neriyamangalam').addE('way').property('distance',3).to(__.V().has('kothamangalam','place', 'kothamangalam').has('place_level2', 'kothamangalam')).next()
    
    g.addV('cheruthoni').property('place','cheruthoni').property('place_level3','cheruthoni').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('cheruthoni','place_level3','cheruthoni').addE('way').property('distance',3).to(__.V().has('neriyamangalam','place', 'neriyamangalam').has('place_level2', 'neriyamangalam')).next()
    
    g.addV('kattappana').property('place','kattappana').property('place_level4','kattappana').property('count',0).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('kattappana','place_level4','kattappana').addE('way').property('distance',3).to(__.V().has('cheruthoni','place', 'cheruthoni').has('place_level3', 'cheruthoni')).next()



    g.addV('moovattupuzha').property('place','moovattupuzha').property('place_level2','moovattupuzha').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('moovattupuzha','place_level2','moovattupuzha').addE('way1').property('distance',3).to(__.V().has('perumbavoor','place', 'perumbavoor').has('place_level1', 'perumbavoor')).next()
    g.addV('thodupuzha').property('place','thodupuzha').property('place_level2','thodupuzha').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('thodupuzha','place_level2','thodupuzha').addE('way1').property('distance',3).to(__.V().has('moovattupuzha','place', 'moovattupuzha').has('place_level2', 'moovattupuzha')).next()
    
    g.V().has('cheruthoni','place_level3','cheruthoni').addE('way1').property('distance',3).to(__.V().has('thodupuzha','place', 'thodupuzha').has('place_level2', 'thodupuzha')).next()
    
    g.V().has('kattappana','place_level4','kattappana').addE('way1').property('distance',3).to(__.V().has('cheruthoni','place', 'cheruthoni').has('place_level3', 'cheruthoni')).next()




    g.V().has('moovattupuzha','place_level2','moovattupuzha').addE('way2').property('distance',3).to(__.V().has('perumbavoor','place', 'perumbavoor').has('place_level1', 'perumbavoor')).next()
    g.V().has('thodupuzha','place_level2','thodupuzha').addE('way2').property('distance',3).to(__.V().has('moovattupuzha','place', 'moovattupuzha').has('place_level2', 'moovattupuzha')).next()
    g.addV('vannappuram').property('place','vannappuram').property('place_level2','vannappuram').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('vannappuram','place_level2','vannappuram').addE('way2').property('distance',3).to(__.V().has('thodupuzha','place', 'thodupuzha').has('place_level2', 'thodupuzha')).next()
    g.V().has('cheruthoni','place_level3','cheruthoni').addE('way2').property('distance',3).to(__.V().has('vannappuram','place', 'vannappuram').has('place_level2', 'vannappuram')).next()
    g.V().has('kattappana','place_level4','kattappana').addE('way2').property('distance',3).to(__.V().has('cheruthoni','place', 'cheruthoni').has('place_level3', 'cheruthoni')).next()



    g.V().has('moovattupuzha','place_level2','moovattupuzha').addE('way3').property('distance',3).to(__.V().has('perumbavoor','place', 'perumbavoor').has('place_level1', 'perumbavoor')).next()
    g.V().has('thodupuzha','place_level2','thodupuzha').addE('way3').property('distance',3).to(__.V().has('moovattupuzha','place', 'moovattupuzha').has('place_level2', 'moovattupuzha')).next()
    g.addV('moolamattam').property('place','moolamattam').property('place_level2','moolamattam').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('moolamattam','place_level2','moolamattam').addE('way3').property('distance',3).to(__.V().has('thodupuzha','place', 'thodupuzha').has('place_level2', 'thodupuzha')).next()
    g.addV('vagman').property('place','vagman').property('place_level3','vagman').property('count',2).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.V().has('vagman','place_level3','vagman').addE('way3').property('distance',3).to(__.V().has('moolamattam','place', 'moolamattam').has('place_level2', 'moolamattam')).next()
    g.V().has('kattappana','place_level4','kattappana').addE('way3').property('distance',3).to(__.V().has('vagman','place', 'vagman').has('place_level3', 'vagman')).next()


    g.V().has('place','perumbavoor').repeat(__.in('way1')).until(__.has('place','kattappana')).path().by('place')


    g.addV('way1').property('place','way1').property('place_level2','way1').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('way1').property('place','way1').property('place_level2','way1').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('way1').property('place','way1').property('place_level2','way1').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()
    g.addV('way1').property('place','way1').property('place_level2','way1').property('count',4).property('created_at',new Date()).property('updated_at',new Date()).next()

   
