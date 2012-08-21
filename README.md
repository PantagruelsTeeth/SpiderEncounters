Spider: Encounters
==================

Spider: Encounters is the debut game from Pantagruel's Teeth. It is a role-playing card game inspired by the
classic solitaire game, Spider. This software is released under the GNU General Public License (v3) and will be
freely available for download, play and modding.

Project Status
--------------

Development Status: Pre-alpha

The game is in the very early stages of development and is not yet playable. A "playable" alpha version
is scheduled for release in Winter 2012. This is likely to only include the combat elements, unless progress is much
faster than I expect ;-)

Releases will be for desktop computers first, with android coming when the game is in beta.

Plot
----

To be announced...

Combat
------

The aim of combat is to clear all enemy cards from the battlefield, in a turn-based race against your opponent.

The battlefield begins with piles of friendly and enemy character cards. Only enemy cards need to be cleared to win the battle. However,
removing your own character's cards boosts your party's battle focus, providing special actions and bonuses. Your opponent plays
the same deal in a parallel solitaire game, but must clear all your character cards while receives bonuses from their own cards instead.
The first side to clear their opponent's character cards from their own solitaire game wins the battle.

Friendly and enemy characters take turns to move cards in their respective solitaire games. As solitaire games, they are played
independently. However, if all the cards of an opponent character are eliminated, then that character falls unconscious and can no longer
take its turns in the opponent's game.

The moves made by an opponent are largely a secret, but you will be informed of any character cards that they successfully clear. The
same secrecy is afforded to the player. The order in which characters take turns is determined by their initiative, which is calculated
from how fast and intelligent that character is, and whether your party was caught in an ambush (or caught the enemy in an ambush).

Card movement is much like the classic Spider solitaire game, but with characters in place of suits. Specifically:

- The top card of every pile is automatically turned face-up
- One or more cards in descending same-character sequence can be moved from the top of one pile to the top of another, as long
as this makes a longer sequence (same or different characters).
- One or more cards in descending same-character sequence can be moved to an empty pile (foundation).
- A complete descending same-character sequence (from highest rank to lowest rank) is immediately removed from the battlefield
- Additional cards can be dealt from the stock pile, as long as their are no empty piles

Some major differences from Spider:

- If no more cards are available to be dealt, and there are no more useful moves, then it is possible to re-deal. Half the remaining cards
will be dealt face-down and the other half will be taken back into the stock pile.
- Characters differ in the number of ranks on their number cards, based upon defence rating. Defence rating can be anything from 0 through
to 12. All characters have as a minimum a Jack, Queen and King. Additional ranks are granted for each point of defence rating, from 1 (Ace)
through to 12. So for a defence rating of three, a complete sequence would be Ace, Two, Three, Jack, Queen and King. An 11 and 12 number
card is possible with a high enough defence rating. So the longest possible sequence is Ace, Two, Three, ... Ten, Eleven, Twelve, Jack, Queen
and King.
- Your own characters' cards are always dealt face-up, even if they are not the top card.

Experience
----------
Characters gain experience with each successful encounter. As characters develop, they gain special abilities, such as extra moves or
the ability to reveal face-down enemy cards. Some abilities require a minimum battle focus to take effect, others expend battle
focus on activation.

Coup-de-grace
-------------
Removing all enemy cards without requiring a re-deal results in a coup-de-grace. Experience gain from a coup-de-grace is
increased by 50%.

Battle Flow
-----------
If the player makes a coup-de-grace AND removes all cards from the battlefield, including their own, then the party achieves
'Battle Flow'. Any remaining battle focus is retained going into the next battle, and the experience bonus of coup-de-grace is
increased by 10% with each successive battle, up to a maximum total bonus of 100% for five or more battles in which Battle Flow is
achieved. The chances of being caught in an ambush are also dramatically reduced while in Battle Flow.
