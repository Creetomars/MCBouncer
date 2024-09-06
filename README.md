# MCB

MCBouncer is a Minecraft ban service. Unlike other ban services for Minecraft, all bans are local to the server that makes them. What this means is that one servers bans do not affect entrance to other servers. The exception to this is if your server subscribes to another server's bans. Appeals are not handled by MCBouncer, all appeals are handled by the staff of the issuing server.

MCBouncer is more aimed to be an information system, what this means is that while all bans are local, other servers see the bans of all the other servers and make their own decisions on users from that. You can also access all ban information from the website as well as from the server if you have a valid API key.


==Download==
You can download the latest MCBouncer [[http://mcbouncer.com/info/download|here]]

==Requirements==
* A [[http://bukkit.org|Bukkit]] server using the latest Reccommended Build.
* A valid MCBouncer account, which you can make [[http://mcbouncer.com/registerAccount|here]].
* A permissions plugin, [[http://dev.bukkit.org/server-mods/permissionsex/|PermissionsEX]] is a good one.
* A sense of discovery and adventure.

==Rules==
* No racial remarks in bans or notes

* No homophobic remarks in bans or notes

* Online mode servers only

* You must provide a means for users to appeal


Abuse of MCBouncer may result in your server being disabled, and your inability to use the MCBouncer service in the future. If your server is disabled, none of your bans will be visible in the system, you will not be able to make any bans or notes, or do lookups. Bans issued by a disabled server will be archived in the database.

==Plugin Permissions==
mcbouncer.command.ban

- allow a user to ban

mcbouncer.command.unban

- allow a user to unban

mcbouncer.command.banip

- allow a user to ban an ip

mcbouncer.command.unbanip

- allow a user to unban an ip

mcbouncer.command.lookup

- allow a user to lookup bans/notes

mcbouncer.command.kick

- allow a user to kick

mcbouncer.command.addnote

- allow a user to add a note

mcbouncer.command.removenote

- allow a user to remove a note

mcbouncer.command.reload

- allow a user to reload the mcbouncer config

mcbouncer.mod

- contains all permissions except mcbouncer.command.reload

mcbouncer.admin

- contains all permissions

==Commands==
/ban <user> <reason>

- Ban <user> with the reason of <reason>

/unban <user> - Unban <user>

- Ban <ip> with the reason of <reason>

/banip <ip> <reason>

- Ban <ip> with the reason of <reason>

/unbanip <user>

- Unban <ip>

/addnote <user> <note>

- Add note <note> to <user>

/delnote <noteid> - Delete note <noteid>

- Delete note <noteid>

/lookup <user>

Lookup notes and bans for <user>
