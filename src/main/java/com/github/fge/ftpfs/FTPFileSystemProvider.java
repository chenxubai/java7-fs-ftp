/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.ftpfs;

import java.io.IOException;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;

public final class FTPFileSystemProvider
    extends FileSystemProvider
{
    @Override
    public String getScheme()
    {
        return "ftp";
    }

    @Override
    public FileSystem newFileSystem(final URI uri, final Map<String, ?> env)
        throws IOException
    {
        return null;
    }

    @Override
    public FileSystem getFileSystem(URI uri)
    {
        return null;
    }

    @Override
    public Path getPath(URI uri)
    {
        return null;
    }

    @Override
    public SeekableByteChannel newByteChannel(Path path,
        Set<? extends OpenOption> options, FileAttribute<?>... attrs)
        throws IOException
    {
        return null;
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path dir,
        DirectoryStream.Filter<? super Path> filter)
        throws IOException
    {
        return null;
    }

    @Override
    public void createDirectory(final Path dir, final FileAttribute<?>... attrs)
        throws IOException
    {
        throw new IllegalStateException();
    }

    @Override
    public void delete(final Path path)
        throws IOException
    {
        throw new IllegalStateException();
    }

    @Override
    public void copy(final Path source, final Path target,
        final CopyOption... options)
        throws IOException
    {
        throw new IllegalStateException();
    }

    @Override
    public void move(final Path source, final Path target,
        final CopyOption... options)
        throws IOException
    {
        throw new IllegalStateException();
    }

    @Override
    public boolean isSameFile(Path path, Path path2)
        throws IOException
    {
        return false;
    }

    @Override
    public boolean isHidden(final Path path)
        throws IOException
    {
        return false;
    }

    @Override
    public FileStore getFileStore(Path path)
        throws IOException
    {
        return null;
    }

    @Override
    public void checkAccess(Path path, AccessMode... modes)
        throws IOException
    {

    }

    @Override
    public <V extends FileAttributeView> V getFileAttributeView(Path path,
        Class<V> type, LinkOption... options)
    {
        return null;
    }

    @Override
    public <A extends BasicFileAttributes> A readAttributes(Path path,
        Class<A> type, LinkOption... options)
        throws IOException
    {
        return null;
    }

    @Override
    public Map<String, Object> readAttributes(Path path, String attributes,
        LinkOption... options)
        throws IOException
    {
        return null;
    }

    @Override
    public void setAttribute(final Path path, final String attribute,
        final Object value, final LinkOption... options)
        throws IOException
    {
        throw new IllegalStateException();
    }
}
