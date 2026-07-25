class Solution:
    def minWindow(self, s: str, t: str) -> str:
            # If t is longer than s, impossible to find a window
        if len(t) > len(s):
            return ""

        # Store how many of each character we need
        need = {}

        for ch in t:
            need[ch] = need.get(ch, 0) + 1

        left = 0

        # Total characters still missing -> 3ta value paisi kina oitar count
        missing = len(t)

        # Store the best window
        start = 0
        min_len = float("inf")

        # Expand the window
        for right in range(len(s)):

            # If this character is still needed,
            # we found one required character
            if need.get(s[right], 0) > 0:
                missing -= 1
            need[s[right]] = need.get(s[right], 0) - 1
            # Use this character
            # Positive -> still needed
            # Zero     -> exactly enough
            # Negative -> extra character

            # Window contains every required character
            while missing == 0:
                # Save the smallest valid window
                if right - left + 1 < min_len:
                    min_len = right - left + 1
                    start = left

                # Remove the left character
                need[s[left]] += 1

                # If it becomes positive,
                # we are missing that character again
                if need[s[left]] > 0:
                    missing += 1

                # Shrink the window
                left += 1

        # No valid window found
        if min_len == float("inf"):
            return ""

        # Return the smallest substring
        return s[start:start + min_len]