class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hash1=[0 for _ in range(26)]
        hash2=[0 for _ in range(26)]

        for c in s:
            hash1[ord(c)-ord('a')]+=1
        for c in t:
            hash2[ord(c)-ord('a')]+=1
        
        return True if hash1==hash2 else False