class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        boolean found= false;

        for(int i=0;i<nums.length;i++){
                
                for(int j=0;j<nums.length;j++){
                    if(((nums[i] + nums[j])==target) && found==false && i!=j){

                        result[0]=i;
                        result[1]=j;
                        found=true;

                        
                    }
             }
             
        }
        return result;
    }
    
}

// Clase que contiene la solución
class Solution {

    // Comentarios sobre complejidad
    // Tiempo: O(n) porque recorre el arreglo una vez
    // Espacio: O(n) por el uso del HashMap

    public int[] twoSum(int[] nums, int target) {
        // Crear un mapa para guardar valores e índices
        Map<Integer, Integer> map = new HashMap<>();

        // Recorrer el arreglo
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i]; // Valor actual del arreglo

            // Queremos encontrar x tal que cur + x = target
            // Entonces x = target - cur
            int x = target - cur;

            // Si x ya está en el mapa, encontramos la pareja
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i }; // Devolvemos los índices
            }

            // Si no, almacenamos el valor actual y su índice
            map.put(cur, i);
        }

        // Si no se encuentra ninguna pareja, retorna null
        return null;
    }
}
