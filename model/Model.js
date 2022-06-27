const { g } = require("../connection/connection");

class Model{
    constructor(place,count){
      this.place=place
      this.count=count
    }
    static getData(){
        return new Promise(resolve=>{
          const data=g.V().hasLabel('Perumbavoor').valueMap(true).toList()
          resolve(data)
        })
    }
    static get_all_Data(){
      return new Promise(resolve=>{
        const data=g.V().valueMap(true).toList()
        resolve(data)
      })
  }
    static getData_simple(place){
      return new Promise(resolve=>{
        const data=g.V().has('place',place).valueMap(true).next()
        resolve(data)
      })
  }
    getData_one(){
      return new Promise(resolve=>{
        const data=g.V().has('place',this.place).property('count',Number(this.count)).valueMap(true).toList()
        resolve(data)
      })
  }
  static getData_bus(){
    return new Promise(resolve=>{
      const data=g.V().hasLabel('bus').valueMap(true).next()
      resolve(data)
    })
}
update_count(){
  return new Promise(resolve=>{
    const data=g.V().hasLabel('bus').property('count',Number(this.count)).valueMap(true).next()
    resolve(data)
  })
}
}
module.exports=Model