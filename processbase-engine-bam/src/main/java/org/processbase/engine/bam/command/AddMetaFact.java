/**
 * Copyright (C) 2011 PROCESSBASE Ltd.
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, see <http://www.gnu.org/licenses/>.
 */
package org.processbase.engine.bam.command;

import org.ow2.bonita.env.Environment;
import org.ow2.bonita.util.Command;
import org.processbase.engine.bam.db.HibernateUtil;
import org.processbase.engine.bam.metadata.MetaFact;

/**
 *
 * @author marat
 */
public class AddMetaFact implements Command<Void> {

    private MetaFact metaFact;

    public AddMetaFact(MetaFact metaFact) {
        this.metaFact = metaFact;
    }

    public Void execute(Environment e) throws Exception {
        HibernateUtil hutil = new HibernateUtil();
        hutil.addMetaFact(metaFact);
        return null;
    }
}
