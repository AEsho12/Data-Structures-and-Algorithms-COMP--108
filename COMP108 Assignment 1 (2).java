//
// Note: You are allowed to add additional methods if you need.
// Coded by Prudence Wong 2020-12-15
//
// Name:Ayodele Esho
// Student ID:201499108
//
// Time Complexity and explanation: You can use the following variables for easier reference.
// n denotes the number of requests, p denotes the size of the cache
// n and p can be different and there is no assumption which one is larger
//
// noEvict():
//
// evictFIFO():
//
// evictLFU():
//
// evictLFD():
//

class COMP108A1Paging {


	// no eviction
	// Aim: 
	// do not evict any page
	// count number of hit and number of miss, and find the hit-miss pattern; return an object COMP108A1Output
	// Input:
	// cArray is an array containing the cache with cSize entries
	// rArray is an array containing the requeset sequence with rSize entries
	static COMP108A1Output noEvict(int[] cArray, int cSize, int[] rArray, int rSize) {
		COMP108A1Output output = new COMP108A1Output();
            
           for (int x = 0; x < rSize; x++){ // iterating through request sequence 
           	boolean c = false;
            for (int a = 0; a < cSize; a++){
            	if (cArray[a] == rArray[x]) // Checking if element of cArray is in rArray 
            		c = true;
            }
            if (c == true){ // if c is true, then it counts the number of hits and outputs the hit pattern 
            	output.hitCount++; 
            	output.hitPattern += "h";
            }
            else{
            	output.missCount++; // if c in not true, then it counts the number of misses and outputs the hit patterns 
            	output.hitPattern += "m"; 
            }
           }
       
		return output;
	}

	// evict FIFO
	// Aim: 
	// evict the number present in cache for longest time if next request is not in cache
	// count number of hit and number of miss, and find the hit-miss pattern; return an object COMP108A1Output
	// Input: 
	// cArray is an array containing the cache with cSize entries
	// rArray is an array containing the requeset sequence with rSize entries
	static COMP108A1Output evictFIFO(int[] cArray, int cSize, int[] rArray, int rSize) {
		COMP108A1Output output = new COMP108A1Output();
            
        int k =0;     
        for (int x = 0; x < rSize; x++){ 
          boolean c = false;
          for (int a = 0; a < cSize; a++){
              if (cArray[a] == rArray[x]) 
                  c = true;
          }
          if (c == true){ 
              output.hitCount++; 
              output.hitPattern += "h";
          }
          else{ 
          	  cArray[k] = rArray[x];
          	  k++;
          	  if (k == cSize) k = 0; 
              output.missCount++;  
              output.hitPattern += "m"; 
          }
         }
       
 
		return output;
	}

	// evict LFU
	// Aim:
	// evict the number that is least freently used so far if next request is not in cache
	// count number of hit and number of miss, and find the hit-miss pattern; return an object COMP108A1Output
	// Input:
	// cArray is an array containing the cache with cSize entries
	// rArray is an array containing the requeset sequence with rSize entries
	static COMP108A1Output evictLFU(int[] cArray, int cSize, int[] rArray, int rSize) {
		COMP108A1Output output = new COMP108A1Output();
        int[] s = new int[cSize];
           for (int z = 0; z < cSize; z++){
           	s[z] = 1;
           }
           int e = 0;
        for (int x = 0; x < rSize; x++){ 
          boolean c = false;
          for (int a = 0; a < cSize; a++){
              if (cArray[a] == rArray[x] && c == false){
            	  c = true;
            	  e = a;
              }
          }
          if (c == true){ 
              output.hitCount++; 
              output.hitPattern += "h";
              s[e]++;
          }
          else{
               output.missCount++;
               output.hitPattern += "m"; 
               int min   = s [0];
               int index = 0;
               for (int d = 1; d < cSize; d++){
               if (s[d] < min){
               	min = s [d];
               	index = d;
 
               }	
               }
            s [index] = 1;
            cArray [index] = rArray[x];
          }
        }
		return output;
	}

	// evict LFD
	// Aim:
	// evict the number whose next request is the latest
	// count number of hit and number of miss, and find the hit-miss pattern; return an object COMP108A1Output
	// Input:
	// cArray is an array containing the cache with cSize entries
	// rArray is an array containing the requeset sequence with rSize entries	
	static COMP108A1Output evictLFD(int[] cArray, int cSize, int[] rArray, int rSize) {
		COMP108A1Output output = new COMP108A1Output();
           
          
		return output;
	}

}

