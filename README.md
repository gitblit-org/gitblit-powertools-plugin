## Gitblit Powertools plugin

*REQUIRES 1.5.0*

The Gitblit Powertools plugin enhances Gitblit with several very useful features.

### Features

- gitblit (gb) SSH Command Dispatcher

#### gitblit (gb) SSH Command Dispatcher

This plugin exposes convenient user controls and server management & administration commands through the pluggable SSH command server.

##### Implemented Features

- repository management:
    - lists
    - show/details [1]
    - creation [3]
    - field setting [2]
    - deletion [2]
    - renaming [2]
    - fork [4]
- user management [1]
    - lists
    - show/details
    - creation
    - field setting
    - deletion
    - renaming
    - permissions
    - enabling/disabling
- team management [1]
    - lists
    - show/details
    - creation
    - field setting
    - deletion
    - renaming
    - permissions
    - memberships
- server settings management [1]
    - list settings
    - dscribe/show setting
    - add setting
    - update setting
    - reset setting
- project management
    - lists
- tickets management
    - lists/queries

##### Planned Features

- tickets management
    - creation
    - comments
    - field setting
    - patchset reviews
    - patchset ci verification

[1]: Requires *admin* privileges
[2]: Requires *admin* or *owner* privileges
[3]: Requires *admin* or *create* privileges
[4]: Requires *admin* or *fork* privileges


### Building against a Gitblit RELEASE

    ant && cp build/target/powertools*.zip /path/to/gitblit/plugins

### Building against a Gitblit SNAPSHOT

    # install Gitblit SNAPSHOT into the Moxie repository
    /path/to/dev/gitblit/ant installMoxie

    # refresh dependencies & build plugin
    /path/to/dev/powertools/ant && cp build/target/powertools*.zip /path/to/gitblit/plugins


