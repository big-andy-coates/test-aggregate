[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Coverage Status](https://coveralls.io/repos/github/big-andy-coates/test-aggregate/badge.svg?branch=main)](https://coveralls.io/github/big-andy-coates/test-aggregate?branch=main)
[![build](https://github.com/big-andy-coates/test-aggregate/actions/workflows/build.yml/badge.svg)](https://github.com/big-andy-coates/test-aggregate/actions/workflows/build.yml)
[![CodeQL](https://github.com/big-andy-coates/test-aggregate/actions/workflows/codeql.yml/badge.svg)](https://github.com/big-andy-coates/test-aggregate/actions/workflows/codeql.yml)

# Creek aggregate repo starter

Quickly bootstrap new aggregate repositories and quickly developing Creek microservices.

Click the [Use this template][useThisTemplate] to create a new repository from this template.

See the [docs](https://www.creekservice.org/test-aggregate) for more information.

## Using this template to create a Creek tutorial

If using this template to create a new Creek Tutorial, then there are some additional steps required:

1. Add the new repo to coveralls.io
   1. Enable "Leave comments"
   2. Set "Coverage threshold for failure" to `80`
   3. Set "Coverage decrease threshold for failure" to `1`
   4. note the repo token.
2. Customise the repositories settings in GitHub:
   1. General
        1. disable wiki
        2. disable issues
        3. enable discussions
        4. disable projects 
        5. only allow squash merging
        6. allow auto-merge
        7. auto delete branches
   2. Branches
       1. Protect main branch
           1. Require PR
               1. Require approval
               2. Dismiss stale
           2. Require status checks
               1. CodeQL
               2. build
               3. build_pages
               4. coveralls
   3. Pages
       1. Build from actions
       2. enforce https
   4. Secrets
       1. Actions: Add the `COVERALLS_REPO_TOKEN` secret for the repository
       2. Dependabot: Add the `COVERALLS_REPO_TOKEN` secret for the repository
3. On the main page in GitHub, in about, set `Use your GitHub Pages website`.
4. Add the new tutorial to the [tutorials page][tutorials] on creekservice.org
5. Add the new tutorial sitemap.xml to the root aggregate sitemap.xml: todo

[useThisTemplate]: https://github.com/big-andy-coates/test-aggregate/generate
[tutorials]: https://github.com/big-andy-coates/creek-service.github.io/blob/main/_pages/tutorials.md
