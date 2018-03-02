package cview

class BootStrap {

    def init = { servletContext ->

        if ( Dataset.count() <= 0 ) {

             Dataset top = new Dataset([title: "Adam"])

             Dataset child1 = new Dataset([title: "Child 1"])
             Dataset child2 = new Dataset([title: "Child 2"])
             Dataset child3 = new Dataset([title: "Child 3"])
             top.addToDatasets(child1)
             top.addToDatasets(child2)
             top.addToDatasets(child3)

             Dataset grandchild1_1 = new Dataset([title: "Grand Child 1.1"])
             Dataset grandchild1_2 = new Dataset([title: "Grand Child 1.2"])
             Dataset grandchild1_3 = new Dataset([title: "Grand Child 1.3"])
             child1.addToDatasets(grandchild1_1)
             child1.addToDatasets(grandchild1_2)
             child1.addToDatasets(grandchild1_3)

             Dataset grandchild2_1 = new Dataset([title: "Grand Child 2.1"])
             Dataset grandchild2_2 = new Dataset([title: "Grand Child 2.2"])
             Dataset grandchild2_3 = new Dataset([title: "Grand Child 2.3"])
             child2.addToDatasets(grandchild2_1)
             child2.addToDatasets(grandchild2_2)
             child2.addToDatasets(grandchild2_3)

             Dataset grandchild3_1 = new Dataset([title: "Grand Child 3.1"])
             Dataset grandchild3_2 = new Dataset([title: "Grand Child 3.2"])
             Dataset grandchild3_3 = new Dataset([title: "Grand Child 3.3"])
             child3.addToDatasets(grandchild3_1)
             child3.addToDatasets(grandchild3_2)
             child3.addToDatasets(grandchild3_3)

             top.save()

        }
    }
    def destroy = {
    }
}
