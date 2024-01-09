<h1>Overriding HashCode And Equals</h1>
<p>Java says the following: "You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the Object.hashCode() general contract, which will prevent your class from working properly with all hash-based collections, including HashMap, HashSet, and Hashtable."</p>
<p><img src="https://r.resimlink.com/FhfR7elBM.png" alt="" width="736" height="364" /></p>
<p><img src="https://r.resimlink.com/X_KBcxanO27p.png" alt="" width="736" height="364" /></p>
<p>So, for example, we want to put employee1 and employee2 objects into a HashSet and return only 1 of the objects with the same values, in this case, depending on the parameters of the hashcode() method, if we have not overridden it, our HashSet will perceive them as different objects because it will return different hashcode values.</p>
