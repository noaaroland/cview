package cview

class Dataset {
 
    String title

    Dataset parent
    static hasMany = [datasets: Dataset]

    static belongsTo = [parent: Dataset]

    static mapping = {
        datasets cascade: 'all-delete-orphan'
    }    

    static constraints = {
        parent(nullable: true)
    }
}
